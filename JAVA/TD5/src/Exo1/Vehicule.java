
package Exo1;

public  abstract class Vehicule {
    private String nom ;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
   public  abstract String  getCategorie(); 
   public abstract float getVitesseMaximum();
   public boolean  estVitessePossible( float vitesse){
     return vitesse  <= getVitesseMaximum();
    }
}
