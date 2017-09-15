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
public class Adresse {
    private Client clientAdresse;
    private String titreAdresse;
    private String nomAdresse;
    private String prenomAdresse;
    private String societeAdresse;
    private String numVoieAdresse;
    private String typeVoieAdresse;
    private String nomVoieAdresse;
    private String complementAdresse;
    private String codePostalAdresse;
    private String villeAdresse;

    public Adresse() {
    }

    public Client getClientAdresse() {
        return clientAdresse;
    }

    public void setClientAdresse(Client clientAdresse) {
        this.clientAdresse = clientAdresse;
    }

    public String getSocieteAdresse() {
        return societeAdresse;
    }

    public void setSocieteAdresse(String societeAdresse) {
        this.societeAdresse = societeAdresse;
    }

    public String getTitreAdresse() {
        return titreAdresse;
    }

    public void setTitreAdresse(String titreAdresse) {
        this.titreAdresse = titreAdresse;
    }

    public String getNomAdresse() {
        return nomAdresse;
    }

    public void setNomAdresse(String nomAdresse) {
        this.nomAdresse = nomAdresse;
    }

    public String getPrenomAdresse() {
        return prenomAdresse;
    }

    public void setPrenomAdresse(String prenomAdresse) {
        this.prenomAdresse = prenomAdresse;
    }

    public String getNumVoieAdresse() {
        return numVoieAdresse;
    }

    public void setNumVoieAdresse(String numVoieAdresse) {
        this.numVoieAdresse = numVoieAdresse;
    }

    public String getTypeVoieAdresse() {
        return typeVoieAdresse;
    }

    public void setTypeVoieAdresse(String typeVoieAdresse) {
        this.typeVoieAdresse = typeVoieAdresse;
    }

    public String getNomVoieAdresse() {
        return nomVoieAdresse;
    }

    public void setNomVoieAdresse(String nomVoieAdresse) {
        this.nomVoieAdresse = nomVoieAdresse;
    }

    public String getComplementAdresse() {
        return complementAdresse;
    }

    public void setComplementAdresse(String complementAdresse) {
        this.complementAdresse = complementAdresse;
    }

    public String getCodePostalAdresse() {
        return codePostalAdresse;
    }

    public void setCodePostalAdresse(String codePostalAdresse) {
        this.codePostalAdresse = codePostalAdresse;
    }

    public String getVilleAdresse() {
        return villeAdresse;
    }

    public void setVilleAdresse(String villeAdresse) {
        this.villeAdresse = villeAdresse;
    }

    @Override
    public String toString() {
        return "Adresse{" + "clientAdresse=" + clientAdresse + ", societeAdresse=" + societeAdresse + ", titreAdresse=" + titreAdresse + ", nomAdresse=" + nomAdresse + ", prenomAdresse=" + prenomAdresse + ", numVoieAdresse=" + numVoieAdresse + ", typeVoieAdresse=" + typeVoieAdresse + ", nomVoieAdresse=" + nomVoieAdresse + ", complementAdresse=" + complementAdresse + ", codePostalAdresse=" + codePostalAdresse + ", villeAdresse=" + villeAdresse + '}';
    }
    
    
    
}
