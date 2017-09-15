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
public class Societe {

    private Adresse newAdresse;
    private Image newImage;
    private String siretSociete;
    private String nomSociete;
    private String typeSociete;
    private Double capitalSociete;
    private String rcsSociete;
    private String emailSociete;
    private String telephoneSociete;

    /* -------------------------------- */
    /* ------------- CONSTRUCTOR ------------------- */
    /* -------------------------------- */
    public Societe() {
    }

    public Societe(Adresse newAdresse, Image newImage, String siretSociete, String nomSociete, String typeSociete, Double capitalSociete, String rcsSociete, String emailSociete, String telephoneSociete) {
        this.newAdresse = newAdresse;
        this.newImage = newImage;
        this.siretSociete = siretSociete;
        this.nomSociete = nomSociete;
        this.typeSociete = typeSociete;
        this.capitalSociete = capitalSociete;
        this.rcsSociete = rcsSociete;
        this.emailSociete = emailSociete;
        this.telephoneSociete = telephoneSociete;
    }

    /* -------------------------------- */
    /* ------------- SETTERS ------------------- */
    /* -------------------------------- */
    public void setNewAdresse(Adresse newAdresse) {
        this.newAdresse = newAdresse;
    }

    public void setNewImage(Image newImage) {
        this.newImage = newImage;
    }

    public void setSiretSociete(String siretSociete) {
        this.siretSociete = siretSociete;
    }

    public void setNomSociete(String nomSociete) {
        this.nomSociete = nomSociete;
    }

    public void setTypeSociete(String typeSociete) {
        this.typeSociete = typeSociete;
    }

    public void setCapitalSociete(Double capitalSociete) {
        this.capitalSociete = capitalSociete;
    }

    public void setRcsSociete(String rcsSociete) {
        this.rcsSociete = rcsSociete;
    }

    public void setEmailSociete(String emailSociete) {
        this.emailSociete = emailSociete;
    }

    public void setTelephoneSociete(String telephoneSociete) {
        this.telephoneSociete = telephoneSociete;
    }

    /* -------------------------------- */
    /* ------------- GETTERS ------------------- */
    /* -------------------------------- */
    public Adresse getNewAdresse() {
        return newAdresse;
    }

    public Image getNewImage() {
        return newImage;
    }

    public String getSiretSociete() {
        return siretSociete;
    }

    public String getNomSociete() {
        return nomSociete;
    }

    public String getTypeSociete() {
        return typeSociete;
    }

    public Double getCapitalSociete() {
        return capitalSociete;
    }

    public String getRcsSociete() {
        return rcsSociete;
    }

    public String getEmailSociete() {
        return emailSociete;
    }

    public String getTelephoneSociete() {
        return telephoneSociete;
    }

    @Override
    public String toString() {
        return "Societe{" + "newAdresse=" + newAdresse + ", newImage=" + newImage + ", siretSociete=" + siretSociete + ", nomSociete=" + nomSociete + ", typeSociete=" + typeSociete + ", capitalSociete=" + capitalSociete + ", rcsSociete=" + rcsSociete + ", emailSociete=" + emailSociete + ", telephoneSociete=" + telephoneSociete + '}';
    }

    
    
}
