package Exo3;

public class Homme extends Mammifere implements Deplacement, Raisonnement {
	public Homme(String nom) {
		super(nom);
		
	}

	@Override
	public String reflechir() {
	  	return " Je me déplace debout sur mes deux jambes";
	}

	@Override
	public String seDeplacer() {
	
		return "  Je suis en en pleine réflexion ";
	}

	@Override
	public String toString() {
		return " je suis un animal de nom "+nom+" Je suis un mammifère. Je suis un homme";
	}
	
}
