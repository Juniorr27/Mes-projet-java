package gestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Reservation {
	
	private ArrayList<Salle> salles = createSalle();
	
	static public ArrayList<Salle> createSalle(){
		ArrayList<Salle> salles = new ArrayList<Salle>();
		salles.add(new Salle(Type.PLATE, "0001"));
		salles.add(new Salle(Type.PLATE, "0002"));

		salles.add(new Salle(Type.HYBRIDE, "0010"));
		salles.add(new Salle(Type.HYBRIDE, "0020"));
		
		salles.add(new Salle(Type.MACHINE, "0011"));
		salles.add(new Salle(Type.MACHINE, "0021"));
		
		return salles;
	}
	
	
	
	/**
	 * @return the salles
	 */
	public ArrayList<Salle> getSalles() {
		return salles;
	}



	/**
	 * @param salles the salles to set
	 */
	public void setSalles(ArrayList<Salle> salles) {
		this.salles = salles;
	}



	public void saisirCours() throws HoraireIncorrect, SalleOccupee {
		Scanner scanner = new Scanner(System.in);
		
		String nomCours = "";
		String numeroSalle = "";
		int heureDebut = 0;
		int heureFin = 0;
		
		Salle salleSaisie = null;
	
		boolean saisieInvalide = true;
		boolean exit = false;
		
		try {
			do {
				saisieInvalide = true;
				System.out.println("Entrez le nom du cours, exit pour sortir");
				nomCours = scanner.nextLine();
				if(nomCours.equalsIgnoreCase("exit")) {
					System.out.println("Fin de la saisie, aucun cours saisie");
					exit = true;
					break;
				}
				
				while(saisieInvalide) {
					boolean saisieNumeroSalleValide = false;
					try {
						
						System.out.println("Entrez le numéro de salle parmie les salles suivantes");
						for(Salle s:salles) {
							System.out.println(s.getNumero());
						}
						numeroSalle = scanner.nextLine();
						
						for(Salle s:salles) {
							if(s.getNumero().equals(numeroSalle)) {
								salleSaisie = s;
								saisieNumeroSalleValide = true;
							}
						}
						
						if(!saisieNumeroSalleValide) {
							throw new SalleInexistante("Le numero de salle saisie est invalide");
						}
						System.out.println("voici le planning de cette salle");
						System.out.println(salleSaisie);
						System.out.println("Entrez l'heure de début du cours(8-18)");
						heureDebut = Integer.parseInt(scanner.nextLine());
						System.out.println("Entrez l'heure de fin du cours(9-19)");
						heureFin = Integer.parseInt(scanner.nextLine());
						
						if(heureDebut < 8 || heureFin > 19) {
							throw new HoraireIncorrect("Veuillez entrez une heure comprise entre 8 et 19");
						}
						
						for(int i = heureDebut; i < heureFin; i++) {
							if(!(salleSaisie.estDisponible(i))) {
								throw new SalleOccupee(salleSaisie, heureDebut, "Il existe deja un cours sur la plage horaire saisie");
							}
						}
						
						
						
						salleSaisie.reserver(heureDebut, heureFin, nomCours);
						System.out.println("La salle "+numeroSalle+" à bien été réservée de " + heureDebut +
								" à "+heureFin + " pour un cours de " + nomCours);
						saisieInvalide = false;
					}catch(SalleInexistante e) {
						System.out.println(e.getMessage());
						
					}catch(NumberFormatException e) {
						System.out.println("Vous devez entrez un nombre valide pour les heures");
					}catch(SalleOccupee e) {
						System.out.println(e.getMessage() + " Heure du conflit : "+e.getHeure());
					}catch(HoraireIncorrect e) {
						System.out.println(e.getMessage());
					}
				}
				
			}while(!(nomCours.equalsIgnoreCase("exit")));
			
			
		}finally {
			scanner.close();
		}
		
		if(!exit) {
			System.out.println("Fin de la saisie");
		}
		
		
    }
	
	public Salle findSalle(Type type, int heure) throws HoraireIncorrect {
		for(Salle s:salles) {
			if(s.getType() == type && s.estDisponible(heure)) {
				return s;
			}
		}
		return null;
	}
	
	
}
