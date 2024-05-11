
package Exo1;

public class Main {
     public static void main(String[] args) {
       BateauARames b = new BateauARames(4);
       Voiture v = new Voiture(500);
       BateauARames b1 = new BateauARames(3);
       Voiture v1 = new Voiture(150);
       Vehicule []tab = {b,v,b1,v1};
       for(Vehicule veh : tab ){
           System.out.println("Nom: " + veh.getNom());
            System.out.println("Catégorie: " + veh.getCategorie());
            System.out.println("Vitesse maximale: " + veh.getVitesseMaximum());
            System.out.println("Est-ce que 15 km/h est possible ? " + veh.estVitessePossible(15f));
            System.out.println(); // Ligne vide pour séparer les résultats des différents véhicules
        
       }
    }
}
