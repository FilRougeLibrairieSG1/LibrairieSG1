/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairieenligne2;

import java.util.Date;

/**
 *
 * @author cdi309
 */
public class SimulationPaiement {
    
private String refPaiement;
private Date datePaiement;

private Commande newCommande;  


    //CONSTRUCTOR
    public SimulationPaiement(String refPaiement, Date datePaiement, Commande newCommande) {
        this.refPaiement = refPaiement;
        this.datePaiement = datePaiement;
        this.newCommande = newCommande;
    }

    //GETTER
 public String getRefPaiement() {
        return refPaiement;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public Commande getNewCommande() {
        return newCommande;
    } 

    //SETTER

    public void setRefPaiement(String refPaiement) {
        this.refPaiement = refPaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }

    public void setNewCommande(Commande newCommande) {
        this.newCommande = newCommande;
    }

   


 

}