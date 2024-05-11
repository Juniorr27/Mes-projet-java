package Exo3;

public class Main {
	 public static void main(String args[]) {
		Animaux[]tab = new  Animaux[3];  
		tab[0] = new Mammifere(" Chat ");
		tab[1] = new Chien(" Rex"); 
		tab[2] = new Homme(" Juju ");
		for (Animaux an : tab) {
			System.out.println(an.toString());
			/*Cette partie du code vérifie si l'objet animal
			 *  implémente l'interface Deplacement.
			 *   Si c'est le cas, cela signifie que cet animal 
			 *   est capable de se déplacer, car il a une méthode 
			 * seDeplacer() définie dans cette interface.*/
			if (an instanceof Deplacement) {
				Deplacement deplacement = (Deplacement) an;
                System.out.println(deplacement.seDeplacer());
			}
			if (an instanceof Homme && an instanceof Raisonnement) {
                Raisonnement raisonnement = (Raisonnement) an;
                System.out.println(raisonnement.reflechir());
            }
            System.out.println();
		}
	 }
}
