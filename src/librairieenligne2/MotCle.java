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
public class MotCle {
    private String idMotCle;
    private String intituleMotCle;
    private Vector<Livre> listeLivres;

    public MotCle() {
        this.listeLivres = new Vector<>();
    }

    public MotCle(String idMotCle, String intituleMotCle) {
        this.idMotCle = idMotCle;
        this.intituleMotCle = intituleMotCle;
        this.listeLivres = new Vector<>();
    }

    public String getIdMotCle() {
        return idMotCle;
    }

    public void setIdMotCle(String idMotCle) {
        this.idMotCle = idMotCle;
    }

    public String getIntituleMotCle() {
        return intituleMotCle;
    }

    public void setIntituleMotCle(String intituleMotCle) {
        this.intituleMotCle = intituleMotCle;
    }

    public Vector<Livre> getListeLivres() {
        return listeLivres;
    }

    public void setListeLivres(Vector<Livre> listeLivres) {
        this.listeLivres = listeLivres;
    }

    @Override
    public String toString() {
        return "MotCle{" +
                "idMotCle='" + idMotCle + '\'' +
                ", intituleMotCle='" + intituleMotCle + '\'' +
                ", listeLivres=" + listeLivres +
                '}';
    }
}
