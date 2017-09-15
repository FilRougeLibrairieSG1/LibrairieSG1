/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairieenligne2;

import java.util.Date;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author cdi307
 */
public class Evenement {
    private Image imageEvenement;
    private List<Livre>Livre = new Vector();
    private String nomEvement;
    private String titreAfficheEvenement;
    private String pourcentageRemiseEvenement;
    private Date dateDebutEvenement;
    private Date dateFinEvenement;
    private String DescriptionEvenement;

    public Evenement() {
    }

    public Image getImageEvenement() {
        return imageEvenement;
    }

    public void setImageEvenement(Image imageEvenement) {
        this.imageEvenement = imageEvenement;
    }

    public List<Livre> getLivre() {
        return Livre;
    }

    public void setLivre(List<Livre> Livre) {
        this.Livre = Livre;
    }

    public String getNomEvement() {
        return nomEvement;
    }

    public void setNomEvement(String nomEvement) {
        this.nomEvement = nomEvement;
    }

    public String getTitreAfficheEvenement() {
        return titreAfficheEvenement;
    }

    public void setTitreAfficheEvenement(String titreAfficheEvenement) {
        this.titreAfficheEvenement = titreAfficheEvenement;
    }

    public String getPourcentageRemiseEvenement() {
        return pourcentageRemiseEvenement;
    }

    public void setPourcentageRemiseEvenement(String pourcentageRemiseEvenement) {
        this.pourcentageRemiseEvenement = pourcentageRemiseEvenement;
    }

    public Date getDateDebutEvenement() {
        return dateDebutEvenement;
    }

    public void setDateDebutEvenement(Date dateDebutEvenement) {
        this.dateDebutEvenement = dateDebutEvenement;
    }

    public Date getDateFinEvenement() {
        return dateFinEvenement;
    }

    public void setDateFinEvenement(Date dateFinEvenement) {
        this.dateFinEvenement = dateFinEvenement;
    }

    public String getDescriptionEvenement() {
        return DescriptionEvenement;
    }

    public void setDescriptionEvenement(String DescriptionEvenement) {
        this.DescriptionEvenement = DescriptionEvenement;
    }

    @Override
    public String toString() {
        return "Evenement{" + "imageEvenement=" + imageEvenement + ", Livre=" + Livre + ", nomEvement=" + nomEvement + ", titreAfficheEvenement=" + titreAfficheEvenement + ", pourcentageRemiseEvenement=" + pourcentageRemiseEvenement + ", dateDebutEvenement=" + dateDebutEvenement + ", dateFinEvenement=" + dateFinEvenement + ", DescriptionEvenement=" + DescriptionEvenement + '}';
    }
    
    
    
    
}
