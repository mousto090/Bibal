package control;

import Utility.BibalExceptions;
import static Utility.Utility.formatDate;
import static Utility.Utility.formatMillisToDate;
import java.util.ArrayList;
import objets_metiers.Emprunt;
import objets_metiers.Exemplaire;
import objets_metiers.Oeuvre;
import objets_metiers.Reservation;
import objets_metiers.Usager;

public class EmpruntControl {

    public static void emprunter(int id, String titre) throws BibalExceptions {
        Usager usager = new Usager();
        usager = usager.findById(id);
        if (null == usager) {
            throw new BibalExceptions("L'usager n'est pas enregistré");
        }
        Oeuvre oeuvre = new Oeuvre();
        ArrayList<Oeuvre> oeuvres = oeuvre.findByTitre(titre);
        oeuvre = (oeuvres == null) ? null : oeuvres.get(0);
        if (null == oeuvre) {
            throw new BibalExceptions("L'oeuvre n'existe pas");
        }
        Exemplaire exemplaire = new Exemplaire();
        ArrayList<Exemplaire> exemplaires = exemplaire.findExemplaireDispo(oeuvre);
        exemplaire = (exemplaires == null) ? null : exemplaires.get(0);
        if(null == exemplaire){
            throw new BibalExceptions("Aucun exemplaire de l'oeuvre '" 
                    +oeuvre.getTitre()+"' n'est disponible\n"
                    + " Veuillez réserver l'oeuvre");
        }
        String dateJour = formatMillisToDate(System.currentTimeMillis());
        Emprunt emprunt = new Emprunt();
        emprunt.emprunter(usager, oeuvre, exemplaire, formatDate(dateJour));
        //verifier si l'oeuvre est reserver par l'usager si oui l'annuler
        //if(oeuvre.fi)
        Reservation reservation;
        //(reservation = ReservationControl.findByReservation(usager, oeuvre));
        if(null != ReservationControl.findByReservation(usager, oeuvre)){
          ReservationControl.annuler(usager.getId(), titre);
        }
    }

}
