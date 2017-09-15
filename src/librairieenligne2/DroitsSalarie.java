/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librairieenligne2;

/**
 *
 * @author cdi313
 */
public class DroitsSalarie {

    private int typeDroit;
    private String nomDroit;

    /* -------------------------------- */
    /* ------------- CONSTRUCTORS ------------------- */
    /* -------------------------------- */
    public DroitsSalarie() {
    }

    public DroitsSalarie(int typeDroit, String nomDroit) {
        this.typeDroit = typeDroit;
        this.nomDroit = nomDroit;
    }

    /* -------------------------------- */
    /* ------------- SETTERS ------------------- */
    /* -------------------------------- */
    public void setTypeDroit(int typeDroit) {
        this.typeDroit = typeDroit;
    }

    public void setNomDroit(String nomDroit) {
        this.nomDroit = nomDroit;
    }

    /* -------------------------------- */
    /* ------------- GETTERS ------------------- */
    /* -------------------------------- */

    public int getTypeDroit() {
        return typeDroit;
    }

    public String getNomDroit() {
        return nomDroit;
    }

    @Override
    public String toString() {
        return "DroitsSalarie{" + "typeDroit=" + typeDroit + ", nomDroit=" + nomDroit + '}';
    }
    
    
}
