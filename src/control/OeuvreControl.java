package control;

import BibalExceptions.BibalExceptions;
import objets_metiers.Magazine;
import objets_metiers.Livre;
import java.util.ArrayList;
import objets_metiers.Oeuvre;

public class OeuvreControl {

    public void ajouter(String titre, String auteur, String categorie, int lending,
            String typeOeuvre) throws BibalExceptions {

        Oeuvre oeuvre;

        if (typeOeuvre.equals(Magazine.class.getSimpleName())) {
            oeuvre = new Magazine();
            ((Magazine) oeuvre).setLending(lending);
        } else {
            oeuvre = new Livre();
            ((Livre) oeuvre).setLending(lending);
        }
        oeuvre.setTitre(titre);
        oeuvre.setAuteur(auteur);
        oeuvre.setCategorie(categorie);
        oeuvre.ajouter(oeuvre);
    }

    public void modifier(int id, String titre, String auteur, String categorie,
            int lending, int nbResa, String typeOeuvre) throws BibalExceptions {

        Oeuvre oeuvre;
        if (typeOeuvre.equals(Magazine.class.getSimpleName())) {
            oeuvre = new Magazine();
            ((Magazine) oeuvre).setLending(lending);
        } else {
            oeuvre = new Livre();
            ((Livre) oeuvre).setLending(lending);
        }

        oeuvre.setId(id);
        oeuvre.setTitre(titre);
        oeuvre.setAuteur(auteur);
        oeuvre.setCategorie(categorie);
        oeuvre.setNbResa(nbResa);

        oeuvre.modifier(oeuvre);
    }

    public Oeuvre findById(int id) throws BibalExceptions {
        Oeuvre oeuvre = new Oeuvre();
        return oeuvre.findById(id);
    }

    public ArrayList<Oeuvre> findByTitre(String titre) throws BibalExceptions {
        Oeuvre oeuvre = new Oeuvre();
        return oeuvre.findByTitre(titre);
    }
}
