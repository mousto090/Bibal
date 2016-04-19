/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

import Utility.BibalExceptions;
import control.EmpruntControl;
import objets_metiers.Livre;
import objets_metiers.Magazine;

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
//           
//        UsagerControl.ajouter(new Usager("Diallo", "Mamadou", formatDate("27/06/1990"),
//                "M", "Kamra cym Rabat", "0695948756"));
//        UsagerControl.modifier(new Usager(1, "Darrouji", "Bader", formatDate("27/06/1997"),
//                "M", "Kenitra Kenitra", "0695948756"));
//            Usager u = usagerControl.find(3);
//            System.out.println("bibal.Bibal.main()" + u);
//            ArrayList listU= usagerControl.find("DIALLO");
//            System.out.println("bibal.Bibal.main()" + listU);
//            
//        ============== Test oeuvres =============
//        OeuvreControl.ajouter(new Magazine("Magazine 6", "Auteur 3", "Categorie 4"));
//        OeuvreControl.modifier(new Livre(1,"Livre 12", "Auteur 3", "Categorie 1", 0));
//        Oeuvre oeuvre = new Magazine(10,"Magazine 10", "Auteur 1", "Categorie 2", 32);
//        Oeuvre oeuvre = new Livre(1,"Livre 2", "Auteur 2", "Categorie 2", 35);
        //oeuvre.setAuteur("Auteur");
//        oeuvreControl.ajouter("Livre 1", "Auteur 1", "Categorie 1", TYPE_LIVRE);
//        oeuvreControl.modifier(1,"Livre 2", "Auteur 2", "Categorie 2", 5, TYPE_LIVRE);
//        oeuvreControl.modifier(12,"Magazine 7", "Auteur 4", "Categorie 3", 30,6, TYPE_MAGAZINE);
//        oeuvreControl.findByTitre("Livre 7");
//        oeuvreControl.findById(13);
//        System.out.println("bibal.Bibal.main()" + oeuvreControl.find("Livre"));
//        System.out.println("bibal.Bibal.main()" + oeuvreControl.find(13));
//          ================Tests Reservations =============
        //ReservationControl.reserver("Diallo", "Livre 1");
//        String str =  formatMillisToDate(System.currentTimeMillis());
//        System.out.println("bibal.Bibal.main()" + str);
        //System.out.println("bibal.Bibal.main()" + Utility.formatDate(str));
//        =============Tests des Reservations===========
//        ReservationControl.reserver(1, "Livre 12");
//        ReservationControl.reserver(2, "Livre 1");
//        ReservationControl.reserver(3, "Magzine 1");
//        ReservationControl.reserver(4,"Magzine 3");
//        ReservationControl.reserver(4, "Magzine 1");
//        ReservationControl.annuler(1, "Livre 1");
//        ReservationControl.annuler(2, "Livre 1");
//        ReservationControl.annuler(3, "Magzine 1");
//        ReservationControl.annuler(1, "Magzine 3");
//        ReservationControl.annuler(4, "Magzine 1");
//        ReservationControl.findByDateReservaton(formatDate("05/04/2016"));
//        ReservationControl.findById(28);
//        System.out.println("bibal.Bibal.main()" + ReservationControl.findByDateReservaton(formatDate("05/04/2016")));
//        System.out.println("bibal.Bibal.main()" + ReservationControl.findById(28));
//             ============Tests Examplaires===========
//        ExemplaireControl.ajouter(new Livre(2,"Magazine 1", "Auteur 1", "Categorie 1", 2));
//        ExemplaireControl.ajouter(new Magazine(4,"Magazine 3", "Auteur 2", "Categorie 4", 0));
//        System.out.println("bibal.Bibal.main()" + 
//                ExemplaireControl.findExemplaireDispo(new Livre(12,"Magazine 4", "Auteur 1", "Categorie 1", 2)));
//        System.out.println("bibal.Bibal.main()" + ExemplaireControl.findById(6));
//        ================ Test Emprunt ===========
       // EmpruntControl.emprunter(1, "Magazine 3");
//        EmpruntControl.emprunter(3, "Magazine 4");
        System.out.println("IHM.Bibal.main()" +
                EmpruntControl.findEmprunts(new Livre(1,"Livre 12", "Auteur 1", "Categorie 1", 2)));
//        Oeuvre o = new Livre(1, "Magazine 1", "Auteur 1", "Categorie 1", 2);
//        System.out.println("bibal.Bibal.main()" + o.estReservable());
//        Calendar cal = Calendar.getInstance();      
//        //cal.setTime(formatDate("01/12/1997"));
//        cal.add(Calendar.DATE, 10);
//        Date d = cal.getTime();
//        System.out.println("bibal.Bibal.main()" + dateToStr(d));
//          System.out.println("IHM.Bibal.main()" + String.format("2016-04-07","dd/MM/yyyy" ));
    }

}
