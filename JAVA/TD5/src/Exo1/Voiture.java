
package Exo1;

public class Voiture extends Vehicule {
    private int puissance ; 

    public Voiture(int puissance) {
        this.puissance = puissance;
    }

    

    @Override
    public String getCategorie() {
       return "Voiture";
    }

    @Override
    public float getVitesseMaximum() {
        // La vitesse maximale d'une voiture est égale à 1.5 fois la puissance
        return (float) (this.puissance * 1.5);
    }
    
    
}
 