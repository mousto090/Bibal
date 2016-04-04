package control;

import BibalExceptions.BibalExceptions;
import static Utility.Utility.formatDate;
import static Utility.Utility.formatMillisToDate;
import objets_metiers.Oeuvre;
import objets_metiers.Reservation;
import objets_metiers.Usager;

public class ReservationControl {
	
    public void reserver(String nom, String titre) throws BibalExceptions{
        Usager usager = new Usager().findByNom(nom).get(0);
        Oeuvre oeuvre = new Oeuvre().findByTitre(titre).get(0);
        String datJour = formatMillisToDate(System.currentTimeMillis());
//        System.out.println("control.ReservationControl.reserver()" + datJour);
//        System.out.println("control.ReservationControl.reserver()" + formatDate(datJour));
        Reservation reservation = new Reservation(usager, oeuvre, formatDate(datJour));
        reservation.enregistrer(usager, oeuvre, reservation.getDate());
//        System.out.println("control.ReservationControl.reserver()" + reservation);
//        System.out.println("control.ReservationControl.reserver()" + reservation.getDate());
    }
}