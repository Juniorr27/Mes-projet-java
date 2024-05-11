
package Exo1;


public class BateauARames  extends Vehicule {
    private int nbRameurs;

    public BateauARames(int nbRameurs) {
        this.nbRameurs = nbRameurs;
    }
    

    @Override
    public String getCategorie(){
       return "BateauARames";
    }

    @Override
    public float getVitesseMaximum(){
        // La vitesse maximale d'un bateau à rames est égale à 0.5 fois le nombre de rameurs
        return (float) (this.nbRameurs * 0.5);
    }
    
}
