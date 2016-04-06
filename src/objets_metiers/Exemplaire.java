package objets_metiers;

import Utility.BibalExceptions;
import Utility.DBConnection;
import static Utility.Utility.closeStatement;
import static Utility.Utility.closeStatementResultSet;
import static Utility.Utility.initialiseRequetePreparee;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

public class Exemplaire {

    private int id;
    private Vector<Emprunt> empruntsExamplaire = new Vector<Emprunt>();
    private Oeuvre oeuvresExamplaire = new Oeuvre();

    public int getId() {
        return id;
    }

    public void setId(int id) throws BibalExceptions {
        if (id <= 0) {
            throw new BibalExceptions("Identifiant Oeuvre non valide !");
        }
        this.id = id;
    }

    public Oeuvre getOeuvresExamplaire() {
        return oeuvresExamplaire;
    }

    public void setOeuvresExamplaire(Oeuvre oeuvresExamplaire) {
        this.oeuvresExamplaire = oeuvresExamplaire;
    }

    public void ajouter(Oeuvre oeuvre) throws BibalExceptions {
        final String SQL_INSERT = "INSERT INTO exemplaire "
                + "( OeuvreID ) VALUES ( ? )";
        PreparedStatement preparedStatement = null;
        try {

            preparedStatement = initialiseRequetePreparee(DBConnection.getConnection(), SQL_INSERT,
                    oeuvre.getId());
            int statut = preparedStatement.executeUpdate();
            if (statut == 0) {
                throw new BibalExceptions("Echec d'ajout de l'exemplaire");
            }

        } catch (SQLException | BibalExceptions e) {
            throw new BibalExceptions("Erreurs lors de l'ajout de l'exemplaire " + e.getMessage(), e.getCause());
        } finally {
            closeStatement(preparedStatement);
        }
    }

    public ArrayList<Exemplaire> getAll() throws BibalExceptions {
        final String SQL_SELECT = "SELECT * FROM exemplaire ORDER BY id";
        return find(SQL_SELECT, new Object[0]);
    }

    public Exemplaire findById(int id) throws BibalExceptions {
        final String SQL_SELECT_BY_ID = "SELECT e.*, o.Titre, o.Auteur"
                + " FROM exemplaire e, oeuvre o"
                + " WHERE e.OeuvreID = o.id"
                + " AND e.id = ?";
        ArrayList<Exemplaire> exemplaires = find(SQL_SELECT_BY_ID, id);
        return exemplaires.isEmpty() ? null : exemplaires.get(0);
    }

    public ArrayList<Exemplaire> findExemplaireDispo(Oeuvre oeuvre) throws BibalExceptions {
        final String SQL_SELECT_BY_ID_IDOEUVRE = " SELECT e.*, o.Titre, o.Auteur"
                + " FROM exemplaire e, oeuvre o"
                + " WHERE e.OeuvreID = o.id"
                + " AND e.OeuvreID = ?"
                + " AND e.id NOT IN (SELECT ExemplaireId FROM emprunt \n"
                + "              WHERE DateRetourEffective IS NULL )";
        ArrayList<Exemplaire> exemplaires = find(SQL_SELECT_BY_ID_IDOEUVRE, oeuvre.getId());
        return exemplaires.isEmpty() ? null : exemplaires;
    }

    private ArrayList<Exemplaire> find(String sql, Object... objets) throws BibalExceptions {
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        ArrayList<Exemplaire> listExemplaires = new ArrayList<>();

        try {
            preparedStatement = initialiseRequetePreparee(DBConnection.getConnection(), sql, objets);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listExemplaires.add(mappingExamplaire(resultSet));
            }
        } catch (SQLException e) {
            throw new BibalExceptions("Aucun enregistrement trouvé " + e.getMessage());
        } finally {
            closeStatementResultSet(preparedStatement, resultSet);
        }
        return listExemplaires;
    }

    private static Exemplaire mappingExamplaire(ResultSet resultSet) throws SQLException {

        Exemplaire exemplaire = new Exemplaire();
        try {
            exemplaire.setId(resultSet.getInt("id"));
            exemplaire.oeuvresExamplaire.setId(resultSet.getInt("OeuvreID"));
            exemplaire.oeuvresExamplaire.setTitre(resultSet.getString("Titre"));
            exemplaire.oeuvresExamplaire.setAuteur(resultSet.getString("Auteur"));
        } catch (BibalExceptions e) {
            System.out.println(e.getMessage());
        }
        return exemplaire;
    }

    @Override
    public String toString() {
        return "Exemplaire{" + "id=" + id + ", empruntsExamplaire=" + empruntsExamplaire + ", oeuvresExamplaire=(" + oeuvresExamplaire + ")}\n";
    }

}
