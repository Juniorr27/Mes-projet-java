
package comptes.bancaires;

public class CompteEpargne extends Compte {
    private float tauxInteretAnnuel;
    private int nbAnneEpargne;
    
    public CompteEpargne(String id, float sol, float TIA) {
      super(id,sol);
      this.tauxInteretAnnuel = TIA;
         
    }
       

    public float getTauxInteretAnnuel() {
        return tauxInteretAnnuel;
    }

    public void setTauxInteretAnnuel(float tauxInteretAnnuel) {
        this.tauxInteretAnnuel = tauxInteretAnnuel;
    }

    public int getNbAnneEpargne() {
        return nbAnneEpargne;
    }

    public void setNbAnneEpargne(int nbAnneEpargne) {
        this.nbAnneEpargne = nbAnneEpargne;
    }
    @Override
    public String getNatureCompte(){
        return "compte avec intérêt";
    }
    @Override
    public float getSolde(){
          
        return super.getSolde() *(float)Math.pow(tauxInteretAnnuel + 1, nbAnneEpargne);
        
    }
}
/* @Override
    public float getSolde() {
        // Implémentez le calcul du nouveau solde en utilisant la formule des intérêts composés
        // par exemple : solde * (1 + tauxInteretAnnuel) ^ nbAnneEpargne
        // Remplacez cette ligne avec votre propre logique.
        return super.getSolde() * (1 + tauxInteretAnnuel); 
    }
}*/
/*Utiliser la formule des intérêts composés :

La formule des intérêts composés est souvent exprimée comme nouveau_solde = solde_initial * (1 + taux_d_interet)^nombre_d_annees.
Implémenter cela dans la méthode getSolde() :

Dans votre méthode getSolde(), vous devriez utiliser la formule mentionnée ci-dessus. Le solde_initial est le solde original du compte, le taux_d_interet est le taux d'intérêt annuel, et nombre_d_annees est le nombre d'années pour lesquelles les intérêts sont composés.
Assurez-vous d'utiliser les bonnes variables :

Dans votre cas, le solde initial (solde dans votre code) est le solde_initial, le tauxInteretAnnuel est le taux_d_interet, et nbAnneEpargne est le nombre_d_annees.*/
