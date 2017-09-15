/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import librairieenligne2.Commande;
import librairieenligne2.Editeur;

/**
 *
 * @author cdi309
 */

    
    
    public class CRUDCommande extends Parameter {

    private Commande newCommande;
    private Vector<Commande> listCommandes;

    public CRUDCommande() {
        this.newCommande = new Commande();
        this.listCommandes = new Vector<>();
    }

    public void CreateCommande() {
        
        String query = "INSERT INTO Commande (SiretEditeur, nomEditeur, logoEditeur) values (?,?,?)";
        try (Connection cnt = DriverManager.getConnection(this.getUrl(), this.getUser(), this.getMdp());
                PreparedStatement pstmt = cnt.prepareStatement(query);) {

            pstmt.setString(1, this.getNewCommande().getNewClient().getNumClient());
            pstmt.setString(2, this.getNewEditeur().getNomEditeur());
            pstmt.setString(3, this.getNewEditeur().getLogoEditeur().getNomImage());
            try {
                pstmt.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"execute :" + e.getMessage() + "/" + e.getLocalizedMessage());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"2) " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
   public void updateAuteur(String idAuteur){
      String query = "UPDATE Auteur SET nomAuteur= ?, prenomAuteur= ?, photoAuteur=?, nationaliteAuteur=?, dateNaissanceAuteur=?, dateDecesAuteur=? where idAuteur='"+idAuteur+"'";
       try(Connection cnt = DriverManager.getConnection(this.getUrl(), this.getUser(), this.getMdp());
            PreparedStatement pstmt = cnt.prepareStatement(query);
                ){
           
         try {
             pstmt.setString(1, this.getNewAuteur().getNomAuteur());
             pstmt.setString(2, this.getNewAuteur().getPrenomAuteur());
             pstmt.setString(3, this.getNewAuteur().getImageAuteur().getNomImage());
             pstmt.setString(4, this.getNewAuteur().getNationalitéAuteur());
             pstmt.setDate(5, this.getNewAuteur().getDateNaissanceAuteur());
             pstmt.setDate(6, this.getNewAuteur().getDateDecesAuteur());

            pstmt.executeUpdate();
           

           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"vue :"+e.getMessage()+"/"+e.getLocalizedMessage());
           }
           

      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"2) " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void deleteEditeur(String idEditeur){
      String query = "DELETE FROM Editeur WHERE ";
       try(Connection cnt = DriverManager.getConnection(this.getUrl(), this.getUser(), this.getMdp());
            PreparedStatement pstmt = cnt.prepareStatement(query);
            
                ){
           
         try {
             

            pstmt.executeUpdate();
           

           } catch (Exception e) {
               JOptionPane.showMessageDialog(null,"vue :"+e.getMessage()+"/"+e.getLocalizedMessage());
           }
           

      
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"2) " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    public Vector<Editeur> readEditeurs() {
        String query = "SELECT * FROM Editeur";
        try (Connection cnt = DriverManager.getConnection(this.getUrl(), this.getUser(), this.getMdp());
                Statement stmt = cnt.createStatement();
                ResultSet rs = stmt.executeQuery(query);) {

            try {

                while (rs.next()) {
                    Editeur editeur = new Editeur();
                    editeur.setSiretEditeur(rs.getString("SiretEditeur"));
                    editeur.setNomEditeur(rs.getString("nomEditeur"));
                    editeur.getLogoEditeur().setNomImage(rs.getString("logoEditeur"));

                    this.listEditeurs.add(editeur);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"vue :" + e.getMessage() + "/" + e.getLocalizedMessage());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"2) " + ex.getMessage());
            ex.printStackTrace();
        }
        return this.listEditeurs;
    }
   
    public Editeur readEditeur(String id){
        String query = "SELECT * FROM Editeur where SiretEditeur='"+id+"'";
        try (Connection cnt = DriverManager.getConnection(this.getUrl(), this.getUser(), this.getMdp());
                Statement stmt = cnt.createStatement();
                ResultSet rs = stmt.executeQuery(query);) {

            try {
                
                    rs.next();
                    this.getNewEditeur().setSiretEditeur(rs.getString("SiretEditeur"));
                    this.getNewEditeur().setNomEditeur(rs.getString("nomEditeur"));
                    this.getNewEditeur().getLogoEditeur().setNomImage(rs.getString("logoEditeur"));
                    
 
                

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"vue :" + e.getMessage() + "/" + e.getLocalizedMessage());
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"2) " + ex.getMessage());
            ex.printStackTrace();
        }
        return this.newEditeur;
    }

    public Commande getNewCommande() {
        return newCommande;
    }

    public void setNewCommande(Commande newCommande) {
        this.newCommande = newCommande;
    }

    public Vector<Commande> getListCommandes() {
        return listCommandes;
    }

    public void setListCommandes(Vector<Commande> listCommandes) {
        this.listCommandes = listCommandes;
    }
    


}


