package Exo3;

public class Chien extends Mammifere implements Deplacement {

	public Chien(String nom) {
		super(nom);
		
	}

	@Override
	public String seDeplacer() {
		
		return "Je me déplace à quatre pattes en remuant la queue";
	}

	@Override
	public String toString() {
		return " je suis un animal de nom" + nom  + " Je suis un mammifère. Je suis un chien";
	}
	

}
