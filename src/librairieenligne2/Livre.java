package librairieenligne2;

import java.util.Date;
import java.util.List;
import java.util.Vector;
import librairieenligne2.Auteur;
import librairieenligne2.Editeur;
import librairieenligne2.Image;
import librairieenligne2.Tva;
import librairieenligne2.TypeLivre;

public class Livre {

   private String ISBN;
    private String titreLivre;
    private String sousTitreLivre;
    private String SynopsisLivre;
    private int nombrePagesLivres;
    private float prixHtLivre;
    private int poidsLivre;
    private Date dateEditionLivre;
    private TypeLivre leType;
    private Genre leGenre;
    private Langue laLangue;
    private Editeur lEditeur;
    private Image uneImage;
    private Statut leStatut;
    private MotCle leMotCle;
    private Tva laTVA;
    private List <Auteur> leVector = new Vector();

   public Livre() {

   }

//SETTERS
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

   public void setTitreLivre(String titreLivre) {
        this.titreLivre = titreLivre;
    }

   public void setSousTitreLivre(String sousTitreLivre) {
        this.sousTitreLivre = sousTitreLivre;
    }

   public void setSynopsisLivre(String SynopsisLivre) {
        this.SynopsisLivre = SynopsisLivre;
    }

   public void setNombrePagesLivres(int nombrePagesLivres) {
        this.nombrePagesLivres = nombrePagesLivres;
    }

   public void setPrixHtLivre(float prixHtLivre) {
        this.prixHtLivre = prixHtLivre;
    }

   public void setPoidsLivre(int poidsLivre) {
        this.poidsLivre = poidsLivre;
    }

   public void setDateEditionLivre(Date dateEditionLivre) {
        this.dateEditionLivre = dateEditionLivre;
    }

   public void setLeType(TypeLivre leType) {
        this.leType = leType;
    }

   public void setLeGenre(Genre leGenre) {
        this.leGenre = leGenre;
    }

   public void setLaLangue(Langue laLangue) {
        this.laLangue = laLangue;
    }

   public void setlEditeur(Editeur lEditeur) {
        this.lEditeur = lEditeur;
    }

   public void setUneImage(Image uneImage) {
        this.uneImage = uneImage;
    }

   public void setLeStatut(Statut leStatut) {
        this.leStatut = leStatut;
    }

   public void setLeMotCle(MotCle leMotCle) {
        this.leMotCle = leMotCle;
    }

   public void setLaTVA(Tva laTVA) {
        this.laTVA = laTVA;
    }

//GETTERS
    public String getISBN() {
        return ISBN;
    }

   public String getTitreLivre() {
        return titreLivre;
    }

   public String getSousTitreLivre() {
        return sousTitreLivre;
    }

   public String getSynopsisLivre() {
        return SynopsisLivre;
    }

   public int getNombrePagesLivres() {
        return nombrePagesLivres;
    }

   public float getPrixHtLivre() {
        return prixHtLivre;
    }

   public int getPoidsLivre() {
        return poidsLivre;
    }

   public Date getDateEditionLivre() {
        return dateEditionLivre;
    }

   public TypeLivre getLeType() {
        return leType;
    }

   public Genre getLeGenre() {
        return leGenre;
    }

   public Langue getLaLangue() {
        return laLangue;
    }

   public Editeur getlEditeur() {
        return lEditeur;
    }

   public Image getUneImage() {
        return uneImage;
    }

   public Statut getLeStatut() {
        return leStatut;
    }

   public MotCle getLeMotCle() {
        return leMotCle;
    }

   public Tva getLaTVA() {
        return laTVA;
    }

 //TO STRING
    @Override
    public String toString() {
        return "Livre{" + "ISBN=" + ISBN + ", titreLivre=" + titreLivre + ", sousTitreLivre=" + sousTitreLivre + ", SynopsisLivre=" + SynopsisLivre + ", nombrePagesLivres=" + nombrePagesLivres + ", prixHtLivre=" + prixHtLivre + ", poidsLivre=" + poidsLivre + ", dateEditionLivre=" + dateEditionLivre + ", leType=" + leType + ", leGenre=" + leGenre + ", laLangue=" + laLangue + ", lEditeur=" + lEditeur + ", uneImage=" + uneImage + ", leStatut=" + leStatut + ", leMotCle=" + leMotCle + ", laTVA=" + laTVA + '}';
    }

}