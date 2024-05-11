
package bâtiments.et.impôts;
   public class Usine extends  Batiment {
   private String nomEntreprise;
   private int nbEmplyer;
   private int nbLivraison;
   public Usine(String nomP, String ad,float su, String nomE){
       super(nomP,ad,su);
       nomEntreprise = nomE;
   }
    public String getNomEntreprise() {
        return nomEntreprise;
    }
    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }
   @Override
   public int getCategorie(){
       return 1;
   }
   public float  FluxVehicule(){
       // Facteurs pondérés
    float poidsNbEmployes = 0.7f;
    float poidsNbLivraisons = 0.3f;

    // Calcul du flux de véhicules
    float fluxVehicules = (poidsNbEmployes * nbEmplyer) + (poidsNbLivraisons * nbLivraison);

    return fluxVehicules; 
   }

    public int getNbEmplyer() {
        return nbEmplyer;
    }

    public void setNbEmplyer(int nbEmplyer) {
        this.nbEmplyer = nbEmplyer;
    }

    public int getNbLivraison() {
        return nbLivraison;
    }

    public void setNbLivraison(int nbLivraison) {
        this.nbLivraison = nbLivraison;
    }

    @Override
    public String affiche() {
        return "Usine{" + "nomEntreprise=" + nomEntreprise +
                ", nbEmplyer=" + nbEmplyer + ", nbLivraison=" + nbLivraison + '}';
    }
    
   
} 

