package objets_metiers;

import BibalExceptions.BibalExceptions;
import Utility.DBConnection;
import static Utility.Utility.YMDtoDMY;
import static Utility.Utility.closeStatement;
import static Utility.Utility.dateToStr;
import static Utility.Utility.initialiseRequetePreparee;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class Reservation {

    private int id;
    private Date date;
    private Usager usagerReservation;
    private Oeuvre oeuvresReservation;

    public Reservation(Usager usager, Oeuvre oeuvre, Date dateJour) {
        this.usagerReservation = usager;
        this.oeuvresReservation = oeuvre;
        this.date = dateJour;
    }

    public Reservation find() {
        throw new UnsupportedOperationException();
    }

    public void destroy() {
        throw new UnsupportedOperationException();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Oeuvre getOeuvresReservation() {
        return oeuvresReservation;
    }

    public void setOeuvresReservation(Oeuvre oeuvresReservation) {
        this.oeuvresReservation = oeuvresReservation;
    }

    public Usager getUsagerReservation() {
        return usagerReservation;
    }

    public void setUsagerReservation(Usager usagerReservation) {
        this.usagerReservation = usagerReservation;
    }

    public void enregistrer(Usager usager, Oeuvre oeuvre, Date dateJour) throws BibalExceptions {
        final String SQL_INSERT = "INSERT INTO Reservation "
                + "(OeuvreID, UsagerID, DateRes) "
                + "VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = null;
        String formatedDateJour = dateToStr(dateJour);
        try {
            preparedStatement = initialiseRequetePreparee(DBConnection.getConnection(), SQL_INSERT,
                    oeuvre.getId(), usager.getId(),
                    formatedDateJour);
            int statut = preparedStatement.executeUpdate();
            if (statut == 0) {
                throw new BibalExceptions("Echec lors de l'enregistrement de la réservation");
            }
            //update du nbResa de de l'oeuvre
            oeuvre.setNbResa(oeuvre.getNbResa() + 1);
            oeuvre.modifier(oeuvre);
        } catch (SQLException e) {
            throw new BibalExceptions("Votre réservation de l'oeuvre '" + oeuvre.getTitre()
            + "'\n pour la date du '" + YMDtoDMY(formatedDateJour) + "' est déjà enregistrée", e.getCause());
        }catch (BibalExceptions e) {
            throw new BibalExceptions("Erreurs lors de l'enregistrement de la réservation ", e.getCause());
        } finally {
            closeStatement(preparedStatement);
        }
    }

    public void annuler(int id){
        
    }
    @Override
    public String toString() {
        return "Reservation{" + "id=" + id + ", date=" + date + ", usagerReservation=" + usagerReservation + ", oeuvresReservation=" + oeuvresReservation + '}';
    }

}
