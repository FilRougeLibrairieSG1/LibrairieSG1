/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairieenligne2;

/**
 *
 * @author cdi313
 */
public class Statut {

    private String nomStatut;
    private String descriptionStatut;

    /* -------------------------------- */
    /* ------------- CONSTRUCTORS ------------------- */
    /* -------------------------------- */
    public Statut() {
    }

    public Statut(String nomStatut, String descriptionStatut) {
        this.nomStatut = nomStatut;
        this.descriptionStatut = descriptionStatut;
    }

    /* -------------------------------- */
    /* ------------- SETTERS ------------------- */
    /* -------------------------------- */
    public void setNomStatut(String nomStatut) {
        this.nomStatut = nomStatut;
    }

    public void setDescriptionStatut(String descriptionStatut) {
        this.descriptionStatut = descriptionStatut;
    }

    /* -------------------------------- */
    /* ------------- GETTERS ------------------- */
    /* -------------------------------- */
    public String getNomStatut() {
        return nomStatut;
    }

    public String getDescriptionStatut() {
        return descriptionStatut;
    }

    @Override
    public String toString() {
        return "Statut{" + "nomStatut=" + nomStatut + ", descriptionStatut=" + descriptionStatut + '}';
    }
    
    

}
