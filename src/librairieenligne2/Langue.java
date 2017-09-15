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
public class Langue {
    private String refLangue;
    private String nomLangue;

    public Langue() {
    }

    public String getRefLangue() {
        return refLangue;
    }

    public void setRefLangue(String refLangue) {
        this.refLangue = refLangue;
    }

    public String getNomLangue() {
        return nomLangue;
    }

    public void setNomLangue(String nomLangue) {
        this.nomLangue = nomLangue;
    }

    @Override
    public String toString() {
        return "Langue{" + "refLangue=" + refLangue + ", nomLangue=" + nomLangue + '}';
    }
    
}
