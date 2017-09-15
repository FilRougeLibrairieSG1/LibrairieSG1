/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairieenligne2;

/**
 *
 * @author cdi307
 */
public class Salarie extends Utilisateur {

    private Statut newStatut;
    private DroitsSalarie newDroitsSalarie;
    private String commentaireSalarie;

    /* -------------------------------- */
    /* ------------- CONSTRUCTOR ------------------- */
    /* -------------------------------- */
    public Salarie() {
    }

    public Salarie(Statut newStatut, DroitsSalarie newDroitsSalarie, String commentaireSalarie, String nomUtilisateur, String prenomUtilisateur, String emailUtilisateur, String loginUtilisateur, String motDePasse, String telephoneUtilisateur) {
        super(nomUtilisateur, prenomUtilisateur, emailUtilisateur, loginUtilisateur, motDePasse, telephoneUtilisateur);
        this.newStatut = newStatut;
        this.newDroitsSalarie = newDroitsSalarie;
        this.commentaireSalarie = commentaireSalarie;
    }

    
    /* -------------------------------- */
    /* ------------- SETTERS ------------------- */
    /* -------------------------------- */
    public void setNewStatut(Statut newStatut) {
        this.newStatut = newStatut;
    }

    public void setNewDroitsSalarie(DroitsSalarie newDroitsSalarie) {
        this.newDroitsSalarie = newDroitsSalarie;
    }

    public void setCommentaireSalarie(String commentaireSalarie) {
        this.commentaireSalarie = commentaireSalarie;
    }

    /* -------------------------------- */
    /* ------------- GETTERS ------------------- */
    /* -------------------------------- */
    public Statut getNewStatut() {
        return newStatut;
    }

    public DroitsSalarie getNewDroitsSalarie() {
        return newDroitsSalarie;
    }

    public String getCommentaireSalarie() {
        return commentaireSalarie;
    }

    @Override
    public String toString() {
        return "Salarie{" + "newStatut=" + newStatut + ", newDroitsSalarie=" + newDroitsSalarie + ", commentaireSalarie=" + commentaireSalarie + '}';
    }
    
    

}
