/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairieenligne2;

/**
 *
 * @author cdi309
 */
public class LigneCommande {
    
    private int quantiteLigneCommande;
    private float prixLigneCommande;
    private float tauxTVALigneCommande;
    private float reductionLigneCommande;
    
    private Livre newLivre;
    private Commande newCommande;
    
    
    //CONSTRUCTOR 
    public LigneCommande(int quantiteLigneCommande, float prixLigneCommande, float tauxTVALigneCommande, float reductionLigneCommande, Livre newLivre, Commande newCommande) {
        this.quantiteLigneCommande = quantiteLigneCommande;
        this.prixLigneCommande = prixLigneCommande;
        this.tauxTVALigneCommande = tauxTVALigneCommande;
        this.reductionLigneCommande = reductionLigneCommande;
        this.newLivre = newLivre;
        this.newCommande = newCommande;
    }

    //GETTER
    public int getQuantiteLigneCommande() {
        return quantiteLigneCommande;
    }

    public float getPrixLigneCommande() {
        return prixLigneCommande;
    }

    public float getTauxTVALigneCommande() {
        return tauxTVALigneCommande;
    }

    public float getReductionLigneCommande() {
        return reductionLigneCommande;
    }

    public Livre getNewLivre() {
        return newLivre;
    }

    public Commande getNewCommande() {
        return newCommande;
    }
    
    //SETTER
    public void setQuantiteLigneCommande(int quantiteLigneCommande) {
        this.quantiteLigneCommande = quantiteLigneCommande;
    }

    public void setPrixLigneCommande(float prixLigneCommande) {
        this.prixLigneCommande = prixLigneCommande;
    }

    public void setTauxTVALigneCommande(float tauxTVALigneCommande) {
        this.tauxTVALigneCommande = tauxTVALigneCommande;
    }

    public void setReductionLigneCommande(float reductionLigneCommande) {
        this.reductionLigneCommande = reductionLigneCommande;
    }

    public void setNewLivre(Livre newLivre) {
        this.newLivre = newLivre;
    }

    public void setNewCommande(Commande newCommande) {
        this.newCommande = newCommande;
    }
    
}
