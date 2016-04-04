package control;

import BibalExceptions.BibalExceptions;
import java.util.ArrayList;
import java.util.Date;
import objets_metiers.Usager;

public class UsagerControl {

    public void ajouter(String nom, String prenom, Date dateNais, String sexe,
            String adresse, String tel) throws BibalExceptions {

        try {
            Usager usager = new Usager();
            usager.setNom(nom);
            usager.setPrenom(prenom);
            usager.setDateNais(dateNais);
            usager.setSexe(sexe);
            usager.setAdresse(adresse);
            usager.setTel(tel);

            usager.ajouter(usager);

        } catch (BibalExceptions e) {
            throw new BibalExceptions(e.getMessage());
        }
    }

    public void modifier(int id, String nom, String prenom, Date dateNais, String sexe,
            String adresse, String tel) throws BibalExceptions {

        Usager usager = new Usager();
        usager.setId(id);
        usager.setNom(nom);
        usager.setPrenom(prenom);
        usager.setDateNais(dateNais);
        usager.setSexe(sexe);
        usager.setAdresse(adresse);
        usager.setTel(tel);

        usager.modifier(usager);
    }

    public Usager findById(int id) throws BibalExceptions {
        return new Usager().findById(id);
    }

    public ArrayList<Usager> findByNom(String nom) throws BibalExceptions {
        return new Usager().findByNom(nom);
    }
}
