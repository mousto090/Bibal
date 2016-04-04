package DAO.implementDAO;

import BibalExceptions.DAOExceptions;
import objets_metiers.Reservation;

public class ReservationDAO  {

    private static final String SQL_INSERT = "INSERT INTO Reservation "
            + "(OeuvreID, UsagerID, DateRes) "
            + "VALUES (?, ?, ?)";
    private static final String SQL_DELETE_BY_ID = "DELETE FROM oeuvre WHERE id = ? ";
    private static final String SQL_SELECT = "SELECT * FROM oeuvre ORDER BY id";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM oeuvre WHERE id = ?";
    private static final String SQL_SELECT_BY_TYPE_OEUVRE = "SELECT * FROM oeuvre WHERE TypeOeuvre = ?";
    private static final String SQL_UPDATE = "UPDATE oeuvre "
            + " SET Titre = ?, Auteur = ?, Categorie = ?, NbResa = ?, Lending = ?,TypeOeuvre = ? "
            + "WHERE id = ?";

   
    public void inserer(Reservation reservation) throws DAOExceptions {
//        PreparedStatement preparedStatement = null;
//        try {
//            String formatedDateNais = dateToStr("");
//            preparedStatement = initialiseRequetePreparee(connection, SQL_INSERT,
//                    reservation.ge);
//            int statut = preparedStatement.executeUpdate();
//            if (statut == 0) {
//                throw new DAOExceptions("Echec de l'enregistrement de la réservation ");
//            }
//
//        } catch (SQLException | DAOExceptions e) {
//            throw new DAOExceptions("Erreurs lors de l'enregistrement de la réservation ", e.getCause());
//        }finally{
//            closeStatement(preparedStatement);
//        }
    }



}
