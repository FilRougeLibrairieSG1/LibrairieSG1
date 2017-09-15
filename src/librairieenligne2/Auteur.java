/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairieenligne2;

import java.sql.Date;

/**
 *
 * @author cdi307
 */
public class Auteur {
    
    private String nomAuteur;
    private String prenomAuteur;
    private String biographieAuteur;
    private String nationalitéAuteur;
    private Date dateNaissanceAuteur;
    private Date dateDecesAuteur;
    private Image ImageAuteur;

    
    public Auteur() {
    }    
    
    
    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public String getPrenomAuteur() {
        return prenomAuteur;
    }

    public void setPrenomAuteur(String prenomAuteur) {
        this.prenomAuteur = prenomAuteur;
    }

    public String getBiographieAuteur() {
        return biographieAuteur;
    }

    public void setBiographieAuteur(String biographieAuteur) {
        this.biographieAuteur = biographieAuteur;
    }

    public String getNationalitéAuteur() {
        return nationalitéAuteur;
    }

    public void setNationalitéAuteur(String nationalitéAuteur) {
        this.nationalitéAuteur = nationalitéAuteur;
    }

    public Date getDateNaissanceAuteur() {
        return dateNaissanceAuteur;
    }

    public void setDateNaissanceAuteur(Date dateNaissanceAuteur) {
        this.dateNaissanceAuteur = dateNaissanceAuteur;
    }

    public Date getDateDecesAuteur() {
        return dateDecesAuteur;
    }

    public void setDateDecesAuteur(Date dateDecesAuteur) {
        this.dateDecesAuteur = dateDecesAuteur;
    }



    public Image getImageAuteur() {
        return ImageAuteur;
    }

    public void setImageAuteur(Image ImageAuteur) {
        this.ImageAuteur = ImageAuteur;
    }

    @Override
    public String toString() {
        return "Auteur{" + "nomAuteur=" + nomAuteur + ", prenomAuteur=" + prenomAuteur + ", biographieAuteur=" + biographieAuteur + ", nationalit\u00e9Auteur=" + nationalitéAuteur + ", dateNaissanceAuteur=" + dateNaissanceAuteur + ", dateDecesAuteur=" + dateDecesAuteur + ", ImageAuteur=" + ImageAuteur + '}';
    }
    
    
    
}
