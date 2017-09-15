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
import librairieenligne2.Editeur;

/**
 *
 * @author cdi309
 */

    
    
    public class CRUDCommande extends Parameter {

    private Editeur newEditeur;
    private Vector<Editeur> listEditeurs;

    public CRUDCommande() {
        this.newEditeur = new Editeur();
        this.listEditeurs = new Vector<>();
    }

    public void CreateCommande() {
        String query = "INSERT INTO Editeur (SiretEditeur, nomEditeur, logoEditeur) values (?,?,?)";
        try (Connection cnt = DriverManager.getConnection(this.getUrl(), this.getUser(), this.getMdp());
                PreparedStatement pstmt = cnt.prepareStatement(query);) {

            pstmt.setString(1, this.getNewEditeur().getSiretEditeur());
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
    
    public void updateEditeur(String idEditeur){
      String query = "UPDATE Editeur SET SiretEditeur= '"+this.getNewEditeur().getSiretEditeur()+"', nomEditeur = '"+this.getNewEditeur().getNomEditeur()+"', logoEditeur = '"+this.getNewEditeur().getLogoEditeur().getNomImage()+"' where SiretEditeur='"+idEditeur+"'";
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
    
        public Editeur getNewEditeur() {
        return newEditeur;
    }

    public void setNewEditeur(Editeur newEditeur) {
        this.newEditeur = newEditeur;
    }

    public Vector<Editeur> getListEditeurs() {
        return listEditeurs;
    }

    public void setListEditeurs(Vector<Editeur> listEditeurs) {
        this.listEditeurs = listEditeurs;
    }

    @Override
    public String toString() {
        return "CrudEditeur{" + "newEditeur=" + newEditeur + ", listEditeurs=" + listEditeurs + '}';
    }

}


