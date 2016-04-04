/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibal;

import BibalExceptions.BibalExceptions;
import objets_metiers.Livre;
import objets_metiers.Magazine;
import control.ReservationControl;

/**
 *
 * @author Jalloh
 */
public class Bibal {

    /**
     * @param args the command line arguments
     */
    private static final String TYPE_MAGAZINE = Magazine.class.getSimpleName();
    private static final String TYPE_LIVRE = Livre.class.getSimpleName();

    public static void main(String[] args) throws BibalExceptions {
        System.out.println("\t\t===== LES TESTS  ===========");

//        ====Test creer usager========
//            UsagerControl usagerControl = new UsagerControl();
//           
//            usagerControl.ajouter("Diallo", "Mamadou", formatDate("27/06/1990"),
//                    "M", "Kamra cym Rabat", "0695948756");
//            usagerControl.modifier(16,"Darrouji", "Bader", formatDate("27/06/1997"),
//                    "M", "Kenitra Kenitra", "0695948756");
//            Usager u = usagerControl.find(3);
//            System.out.println("bibal.Bibal.main()" + u);
//            ArrayList listU= usagerControl.find("DIALLO");
//            System.out.println("bibal.Bibal.main()" + listU);
//            
         
//        ============== Test oeuvres =============
//        OeuvreControl oeuvreControl = new OeuvreControl();
//        Oeuvre oeuvre = new Magazine(10,"Magazine 10", "Auteur 1", "Categorie 2", 32);
        //Oeuvre oeuvre = new Livre(1,"Livre 2", "Auteur 2", "Categorie 2", 35);

        //oeuvre.setAuteur("Auteur");
        //oeuvreControl.ajouter("Livre 1", "Auteur 1", "Categorie 1", 10, TYPE_LIVRE);
        //oeuvreControl.modifier(1,"Livre 2", "Auteur 2", "Categorie 2", 15, 5, TYPE_LIVRE);
//        oeuvreControl.modifier(12,"Magazine 7", "Auteur 4", "Categorie 3", 30,6, TYPE_MAGAZINE);
//        oeuvreControl.findByTitre("Livre 7");
//        oeuvreControl.findById(13);
//        System.out.println("bibal.Bibal.main()" + oeuvreControl.find("Livre"));
//        System.out.println("bibal.Bibal.main()" + oeuvreControl.find(13));
//        String str =  formatMillisToDate(System.currentTimeMillis());
//        System.out.println("bibal.Bibal.main()" + str);
        //System.out.println("bibal.Bibal.main()" + Utility.formatDate(str));
        ReservationControl reservationControl = new ReservationControl();
        reservationControl.reserver("Diallo", "Livre 1");
                

    }

}
