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
public class Image {
    private String nomImage; // Ont Place le nom de l'image ici "monExemple.png".
    private String cheminImage; // Ont place le chemin de l'image ici "monchemin\\image" ont oublie pas de faire 2 anti Slash pour éviter un conflit.
    private String urlLocal; // Contiendra le résulta de la concaténation en résulta -> monChemin\image\monExemple.png

    public Image() {
        
    }

    public Image(String nomImage) {
       // this.nomImage = nomImage;
//      this.cheminImage = cheminImage;
//      this.urlLocal = urlLocal;
    }
    
    

    public String getNomImage() {
        return nomImage;
    }

    public void setNomImage(String nomImage) {
        this.nomImage = nomImage;
    }
    
    public String getUrlLocalVersion(){
        this.urlLocal = this.getCheminImage()+"\\"+this.getNomImage();
        return this.urlLocal;
    }

    public String getCheminImage() {
        return cheminImage;
    }

    public void setCheminImage(String cheminImage) {
        this.cheminImage = cheminImage;
    }
    
    
}
