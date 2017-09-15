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
public class TarifExpedition {
    
    private String refTarifExpedition;
    private float tarifForfaitExpedtion;
    
    private Expediteur newExpediteur;
    
    //CONSTRUCTOR

    public TarifExpedition(String refTarifExpedition, float tarifForfaitExpedtion, Expediteur newExpediteur) {
        this.refTarifExpedition = refTarifExpedition;
        this.tarifForfaitExpedtion = tarifForfaitExpedtion;
        this.newExpediteur = newExpediteur;
    }

    
    //GETTER
    public String getRefTarifExpedition() {
        return refTarifExpedition;
    }

    public float getTarifForfaitExpedtion() {
        return tarifForfaitExpedtion;
    }

    public Expediteur getNewExpediteur() {
        return newExpediteur;
    }
    
    
    //SETTER
    public void setRefTarifExpedition(String refTarifExpedition) {
        this.refTarifExpedition = refTarifExpedition;
    }

    public void setTarifForfaitExpedtion(float tarifForfaitExpedtion) {
        this.tarifForfaitExpedtion = tarifForfaitExpedtion;
    }

    public void setNewExpediteur(Expediteur newExpediteur) {
        this.newExpediteur = newExpediteur;
    }
    
}
