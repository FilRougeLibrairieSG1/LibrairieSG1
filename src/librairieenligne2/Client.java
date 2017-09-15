/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairieenligne2;

import java.util.Vector;

/**
 *
 * @author cdi307
 */
public class Client extends Utilisateur{
    private String numClient;
    private Statut newStatut;
    private String nomSocieteClient;
    private String dateNaissanceClient;
    private String genreClient;
    private Adresse AdresseLivraison;
    private Adresse AdresseFacturation;
    private Vector<Evaluation> newEvaluation;

    public Client(String numClient, Statut newStatut, String nomSocieteClient, String dateNaissanceClient, String genreClient, Adresse adresseLivraison, Adresse adresseFacturation) {
        this.newEvaluation = new Vector<>();
        this.numClient = numClient;
        this.newStatut = newStatut;
        this.nomSocieteClient = nomSocieteClient;
        this.dateNaissanceClient = dateNaissanceClient;
        this.genreClient = genreClient;
        AdresseLivraison = adresseLivraison;
        AdresseFacturation = adresseFacturation;
    }

    public Client(String nomUtilisateur, String prenomUtilisateur, String emailUtilisateur, String loginUtilisateur, String motDePasse, String telephoneUtilisateur, String numClient, Statut newStatut, String nomSocieteClient, String dateNaissanceClient, String genreClient, Adresse adresseLivraison, Adresse adresseFacturation) {
        super(nomUtilisateur, prenomUtilisateur, emailUtilisateur, loginUtilisateur, motDePasse, telephoneUtilisateur);
        this.newEvaluation = new Vector<>();
        this.numClient = numClient;
        this.newStatut = newStatut;
        this.nomSocieteClient = nomSocieteClient;
        this.dateNaissanceClient = dateNaissanceClient;
        this.genreClient = genreClient;
        AdresseLivraison = adresseLivraison;
        AdresseFacturation = adresseFacturation;
    }

    public String getNumClient() {
        return numClient;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    public Statut getNewStatut() {
        return newStatut;
    }

    public void setNewStatut(Statut newStatut) {
        this.newStatut = newStatut;
    }

    public String getNomSocieteClient() {
        return nomSocieteClient;
    }

    public void setNomSocieteClient(String nomSocieteClient) {
        this.nomSocieteClient = nomSocieteClient;
    }

    public String getDateNaissanceClient() {
        return dateNaissanceClient;
    }

    public void setDateNaissanceClient(String dateNaissanceClient) {
        this.dateNaissanceClient = dateNaissanceClient;
    }

    public String getGenreClient() {
        return genreClient;
    }

    public void setGenreClient(String genreClient) {
        this.genreClient = genreClient;
    }

    public Adresse getAdresseLivraison() {
        return AdresseLivraison;
    }

    public void setAdresseLivraison(Adresse adresseLivraison) {
        AdresseLivraison = adresseLivraison;
    }

    public Adresse getAdresseFacturation() {
        return AdresseFacturation;
    }

    public void setAdresseFacturation(Adresse adresseFacturation) {
        AdresseFacturation = adresseFacturation;
    }

    public Vector<Evaluation> getNewEvaluation() {
        return newEvaluation;
    }

    public void setNewEvaluation(Vector<Evaluation> newEvaluation) {
        this.newEvaluation = newEvaluation;
    }

    @Override
    public String toString() {
        return "Client{" +
                "numClient='" + numClient + '\'' +
                ", newStatut=" + newStatut +
                ", nomSocieteClient='" + nomSocieteClient + '\'' +
                ", dateNaissanceClient='" + dateNaissanceClient + '\'' +
                ", genreClient='" + genreClient + '\'' +
                ", AdresseLivraison=" + AdresseLivraison +
                ", AdresseFacturation=" + AdresseFacturation +
                '}';
    }
}
