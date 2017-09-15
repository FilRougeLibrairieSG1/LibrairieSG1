/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairieenligne2;

import java.util.Date;
import java.util.Vector;

/**
 *
 * @author cdi309
 */
public class Commande {
    
    private String numBonCommande;
    private String numFactureCommande;
    private Date dateCommande;
    private String adresseIPCommande;
    private Date dateExpeditionCommande;
    private String refExpeditionCommande;
    
    private Vector <LigneCommande> newLigneCommande;
    private Client newClient;
    private Statut newStatut;
    private Expediteur newExpediteur;
    private Adresse newAdresse;
    private SimulationPaiement newSimulationPaiement;

    //CONSTRUCTOR

    public Commande(String numBonCommande, String numFactureCommande, Date dateCommande, String adresseIPCommande, Date dateExpeditionCommande, String refExpeditionCommande, Vector<LigneCommande> newLigneCommande, Client newClient, Statut newStatut, Expediteur newExpediteur, Adresse newAdresse) {
        this.numBonCommande = numBonCommande;
        this.numFactureCommande = numFactureCommande;
        this.dateCommande = dateCommande;
        this.adresseIPCommande = adresseIPCommande;
        this.dateExpeditionCommande = dateExpeditionCommande;
        this.refExpeditionCommande = refExpeditionCommande;
        this.newLigneCommande = newLigneCommande;
        this.newClient = newClient;
        this.newStatut = newStatut;
        this.newExpediteur = newExpediteur;
        this.newAdresse = newAdresse;
    }

    
    //GETTER

    public String getNumBonCommande() {
        return numBonCommande;
    }

    public String getNumFactureCommande() {
        return numFactureCommande;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public String getAdresseIPCommande() {
        return adresseIPCommande;
    }

    public Date getDateExpeditionCommande() {
        return dateExpeditionCommande;
    }

    public String getRefExpeditionCommande() {
        return refExpeditionCommande;
    }

    public Vector<LigneCommande> getNewLigneCommande() {
        return newLigneCommande;
    }

    public Client getNewClient() {
        return newClient;
    }

    public Statut getNewStatut() {
        return newStatut;
    }

    public Expediteur getNewExpediteur() {
        return newExpediteur;
    }

    public Adresse getNewAdresse() {
        return newAdresse;
    }
 
    
    //SETTER
    public void setNumBonCommande(String numBonCommande) {
        this.numBonCommande = numBonCommande;
    }

    public void setNumFactureCommande(String numFactureCommande) {
        this.numFactureCommande = numFactureCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public void setAdresseIPCommande(String adresseIPCommande) {
        this.adresseIPCommande = adresseIPCommande;
    }

    public void setDateExpeditionCommande(Date dateExpeditionCommande) {
        this.dateExpeditionCommande = dateExpeditionCommande;
    }

    public void setRefExpeditionCommande(String refExpeditionCommande) {
        this.refExpeditionCommande = refExpeditionCommande;
    }

    public void setNewLigneCommande(Vector<LigneCommande> newLigneCommande) {
        this.newLigneCommande = newLigneCommande;
    }

    public void setNewClient(Client newClient) {
        this.newClient = newClient;
    }

    public void setNewStatut(Statut newStatut) {
        this.newStatut = newStatut;
    }

    public void setNewExpediteur(Expediteur newExpediteur) {
        this.newExpediteur = newExpediteur;
    }

    public void setNewAdresse(Adresse newAdresse) {
        this.newAdresse = newAdresse;
    }
    
}
