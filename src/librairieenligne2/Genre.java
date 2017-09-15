
package librairieenligne2;


public class Genre {
    
    private String nomGenre;
    private String idGenre;
    private String sousGenre;
    
    public Genre() {
               
    }
    
    //SETTERS

    public void setNomGenre(String nomGenre) {
        this.nomGenre = nomGenre;
    }

    public void setIdGenre(String idGenre) {
        this.idGenre = idGenre;
    }

    public void setSousGenre(String sousGenre) {
        this.sousGenre = sousGenre;
    }
    
    //GETTERS

    public String getNomGenre() {
        return nomGenre;
    }

    public String getIdGenre() {
        return idGenre;
    }

    public String getSousGenre() {
        return sousGenre;
    }
    
    //TO STRING

    @Override
    public String toString() {
        return "Genre{" + "nomGenre=" + nomGenre + ", idGenre=" + idGenre + ", sousGenre=" + sousGenre + '}';
    }
    
    
   
    
}
