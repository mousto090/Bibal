package objets_metiers;

import BibalExceptions.BibalExceptions;

public class Livre extends Oeuvre {

    private int lending;

    public Livre() {
    }
    
    public Livre(String titre, String auteur, String categorie, int lending) {
        this.titre = titre;
        this.auteur = auteur;
        this.categorie = categorie;
        this.lending = lending;
        this.nbResa = 0;
    }
    
    public Livre(int id, String titre, String auteur, String categorie, int lending) {
        this(titre, auteur, categorie, lending);
        this.id = id;
        this.nbResa = 0;
    }
        
    public int getLending() {
        return this.lending;
    }

    public void setLending(int lending) throws BibalExceptions {
        if (lending < 10) {
            throw new BibalExceptions("La durée d'emprunt des livres "
                    + "doit être superieure ou égale à 10 jours");
        }
        this.lending = lending;
    }
    
    @Override
    public String toString() {
        return "LIVRE{" + super.toString() + "lending=" + lending + '}';
    }
}
