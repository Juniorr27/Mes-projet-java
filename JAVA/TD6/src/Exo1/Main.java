package Exo1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		
		/*Etudiant e = new Etudiant ("BUT","kiala","juju");
		e.setNoteMoyenneUE(2,new int[1]);		
        // Définition de la note moyenne de l'unité 1 à 0.0
        int[] notesUE1 = {}; // Tableau vide car aucune note n'est définie
        e.setNoteMoyenneUE(1, notesUE1);

        // Affichage des détails de l'étudiant après avoir défini la note moyenne de l'unité 1
        System.out.println(e.toString());

        // Tentative de définir à nouveau la note moyenne de l'unité 1 à 0.0
        // Notez que cela est redondant, mais je l'ai ajouté pour répondre à votre question
        e.setNoteMoyenneUE(1, notesUE1);

        // Affichage des détails de l'étudiant après avoir défini à nouveau la note moyenne de l'unité 1
        System.out.println(e.toString());

        // Tentative de définir la note moyenne de l'unité 2 à 0.0
        // Notez que cela est redondant, mais je l'ai ajouté pour répondre à votre question
        e.setNoteMoyenneUE(2, notesUE1);

        // Affichage des détails de l'étudiant après avoir défini à nouveau la note moyenne de l'unité 2
        System.out.println(e.toString());*/
		LinkedList<Etudiant> listeDEtudiants = new LinkedList<Etudiant>();
		
		listeDEtudiants.add(new Etudiant("RT", "Alban", "Fourrier")); 
		listeDEtudiants.add(new Etudiant("INFO", "Bert", "Germain"));
		listeDEtudiants.add(new Etudiant("RT", "Alban", "Fourrier")); 
		listeDEtudiants.add(2, new Etudiant("INFOCOM", "Sophie","Herzig")); 
		listeDEtudiants.add(new Etudiant("INFO", "Agnes", "Nutter"));
		System.out.println(listeDEtudiants);
		System.out.println();
		
		HashSet<Etudiant> ensembleDEtudiants = new  HashSet<Etudiant>(listeDEtudiants); 
		System.out.print(ensembleDEtudiants);
		
		PriorityQueue<Etudiant> pqDEtudiants = new PriorityQueue<Etudiant>(ensembleDEtudiants);
		// pqDEtudiants = new PriorityQueue<Etudiant>(new StringComparator()); 
			for(Etudiant e : listeDEtudiants){ 
			pqDEtudiants.add(e);  
			}
			while(!pqDEtudiants.isEmpty()){ 
				 System.out.println(pqDEtudiants.remove()); 
			}

		System.out.print(pqDEtudiants);
	}

}
