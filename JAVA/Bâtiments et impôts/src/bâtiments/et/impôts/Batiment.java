
package bâtiments.et.impôts;

public class Batiment {
     private String nomProprietaire;
     private String adresse ;
     private float surface;
     
     public Batiment(String nomP, String ad,float su){
         nomProprietaire = nomP;
         adresse = ad;
         surface = su;
     }
     
     public float  calculImpot(){
         return 5*surface;
     }
     
     public int getCategorie(){
         return 0;
     }

    public String getNomProprietaire() {
        return nomProprietaire;
    }

    public void setNomProprietaire(String nomProprietaire) {
        this.nomProprietaire = nomProprietaire;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public float getSurface() {
        return surface;
    }

    public void setSurface(float surface) {
        this.surface = surface;
    }

    
    public String affiche() {
        return "Batiment{" + "nomProprietaire=" + nomProprietaire + 
                ", adresse=" + adresse + ", surface=" + surface + '}';
    }
     
}