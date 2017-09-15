/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import librairieenligne2.Auteur;

/**
 *
 * @author cdi307
 */
public class CrudAuteur extends Parameter{
    private Auteur newAuteur;
    private Vector<Auteur> listAuteur;

    public CrudAuteur() {
        this.newAuteur = new Auteur();
        this.listAuteur = new Vector<>();
    }
    
public void createAuteur(){
        String query = "INSERT INTO Auteur (nomAuteur, prenomAuteur,biographieAuteur,photoAuteur,nationaliteAuteur,dateNaissanceAuteur,dateDecesAuteur) values (?,?,?,?,?,?,?)";
        try (Connection cnt = DriverManager.getConnection(this.getUrl(), this.getUser(), this.getMdp());
                PreparedStatement pstmt = cnt.prepareStatement(query);) {
            String random = "" + ((int)(Math.random()*100000+1));
            pstmt.setString(1, this.getNewAuteur().getNomAuteur());
            pstmt.setString(2, this.getNewAuteur().getPrenomAuteur());
            pstmt.setString(3, this.getNewAuteur().getBiographieAuteur());
            pstmt.setString(4, this.getNewAuteur().getImageAuteur().getNomImage());
            pstmt.setString(5, this.getNewAuteur().getNationalitéAuteur());
            pstmt.setDate(6, this.getNewAuteur().getDateNaissanceAuteur());
            pstmt.setDate(7, this.getNewAuteur().getDateDecesAuteur());
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



    public Auteur getNewAuteur() {
        return newAuteur;
    }

    public void setNewAuteur(Auteur newAuteur) {
        this.newAuteur = newAuteur;
    }

    public Vector<Auteur> getListAuteur() {
        return listAuteur;
    }

    public void setListAuteur(Vector<Auteur> listAuteur) {
        this.listAuteur = listAuteur;
    }


    
}
