package Exo3;

public class Mammifere extends Animaux {
	

	public Mammifere(String nom) {
		super(nom);
	}

	@Override
	public String toString() {
		return " Je suis un animal de nom" + nom +" Je suis un mammifère";
	}
	
}
