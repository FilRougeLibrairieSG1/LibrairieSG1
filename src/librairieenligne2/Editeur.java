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
public class Editeur {
    private String siretEditeur;
    private String nomEditeur;
    private Image logoEditeur;

    public Editeur() {
        this.logoEditeur = new Image();
    }

    
    
    public String getSiretEditeur() {
        return siretEditeur;
    }

    public void setSiretEditeur(String siretEditeur) {
        this.siretEditeur = siretEditeur;
    }

    public String getNomEditeur() {
        return nomEditeur;
    }

    public void setNomEditeur(String nomEditeur) {
        this.nomEditeur = nomEditeur;
    }

    public Image getLogoEditeur() {
        return logoEditeur;
    }

    public void setLogoEditeur(Image logoEditeur) {
        this.logoEditeur = logoEditeur;
    }



    @Override
    public String toString() {
        return "Editeur{" + "siretEditeur=" + siretEditeur + ", nomEditeur=" + nomEditeur + ", logoEditeur=" + logoEditeur + '}';
    }
    
    
    
}
