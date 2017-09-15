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
public class Expediteur {
    
    private String sirenExpediteur;
    private String nomExpediteur;
    
    //CONSTRUCTOR
    public Expediteur(String sirenExpediteur, String nomExpediteur) {
        this.sirenExpediteur = sirenExpediteur;
        this.nomExpediteur = nomExpediteur;
    }


    //GETTER
    public String getSirenExpediteur() {
        return sirenExpediteur;
    }

    public String getNomExpediteur() {
        return nomExpediteur;
    }
    
    //SETTER
    public void setSirenExpediteur(String sirenExpediteur) {
        this.sirenExpediteur = sirenExpediteur;
    }

    public void setNomExpediteur(String nomExpediteur) {
        this.nomExpediteur = nomExpediteur;
    }
    
}
