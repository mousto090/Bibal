package control;

import Utility.BibalExceptions;
import java.util.ArrayList;
import objets_metiers.Exemplaire;
import objets_metiers.Oeuvre;

public class ExemplaireControl {
    
    public static void ajouter(Oeuvre oeuvre) throws BibalExceptions{
        if(null ==  oeuvre.findById(oeuvre.getId())){
           throw new BibalExceptions("L'oeuvre '"+ oeuvre.getTitre()+"' n'existe pas");
        }
        Exemplaire exemplaire = new Exemplaire();
        exemplaire.ajouter(oeuvre);
    }
    
    public static Exemplaire findById(int id) throws BibalExceptions{
        Exemplaire exemplaire = new Exemplaire();
        return exemplaire.findById(id);
    }
    
    public static ArrayList<Exemplaire> findExemplaireDispo(Oeuvre oeuvre) throws BibalExceptions{
        Exemplaire exemplaire = new Exemplaire();
        return exemplaire.findExemplaireDispo(oeuvre);
    }
}