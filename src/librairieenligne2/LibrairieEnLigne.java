/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairieenligne2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author cdi309
 */
public class LibrairieEnLigne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error Connection" + ex.getMessage());
        }

        Connection connexion = null;

        try {
            String url = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=LibrairieEnLigne;"
                    + "user=sa;password=sa";
            connexion = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            System.out.println("Error Connection SQL" + ex.getErrorCode() + ex.getMessage());
            return;
        }

        try {

            String query = "SELECT * FROM Commande Com, Adresse Adr WHERE Com.idAdresseFacturation = Adr.idAdresse";
            String query2 = "SELECT * FROM Commande Com, Adresse Adr WHERE Com.idAdresseLivraison = Adr.idAdresse";

            PreparedStatement pstmt = connexion.prepareStatement(query);
            PreparedStatement pstmt2 = connexion.prepareStatement(query2);

            ResultSet rs = pstmt.executeQuery();
            ResultSet rs2 = pstmt2.executeQuery();

            while (rs.next() && (rs2.next())) {
                System.out.println("\nNuméro de Commande : " + rs.getString("numBonCommande"));
                System.out.println("Adresse de facturation : " + rs.getString("numVoieAdresse") + " " + rs.getString("typeVoieAdresse") + " " + rs.getString("nomVoieAdresse") + " " + rs.getString("complementAdresse") + " " + rs.getString("cPostalAdresse") + " " + rs.getString("villeAdresse"));
                System.out.println("Adresse de livraison : " + rs2.getString("numVoieAdresse") + " " + rs.getString("typeVoieAdresse") + " " + rs.getString("nomVoieAdresse") + " " + rs.getString("complementAdresse") + " " + rs.getString("cPostalAdresse") + " " + rs.getString("villeAdresse"));

//System.out.println("Adresse d'expédition : " + rs.getString("numVoieAdresse") + " " + rs.getString("typeVoieAdresse") + " " + rs.getString("nomVoieAdresse") + " " + rs.getString("complementAdresse") + " " + rs.getString("cPostalAdresse") + " " + rs.getString("villeAdresse") +"\n");
            }
        } catch (SQLException ex) {
            System.out.println("Erreur lecture" + ex.getErrorCode() + ex.getMessage());
        }

        try {
            connexion.close();
        } catch (SQLException ex) {
            System.out.println("Close error" + ex.getErrorCode() + ex.getMessage());
        }
    }
}
