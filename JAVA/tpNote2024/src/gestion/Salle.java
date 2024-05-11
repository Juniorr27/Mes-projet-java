package gestion;

public class Salle{
	private Type type;
	private String numero;
	private String[] horaire;
	
	
	
	public Salle(Type type, String numero) {
		this.type = type;
		this.numero = numero;
		this.horaire = new String[24];
		for(int i = 0; i < 24; i++) {
			horaire[i] = "";
		}
	}

	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * permet de savoir si la salle est disponible à l'heure passé en paramètre
	 * @param heure
	 * @return
	 * @throws HoraireIncorrect
	 */
	public boolean estDisponible(int heure) throws HoraireIncorrect {
		if(heure < 8 || heure > 18) {
			throw new HoraireIncorrect("Horaire invalide");
		}
		
		return horaire[heure ].equals("");
		 	
	}
	
	public String getCours(int heure) throws HoraireIncorrect {
		if(heure < 8 || heure > 18) {
			throw new HoraireIncorrect("Horaire invalide");
		}
		if(horaire[heure].isEmpty()) {
			return null;
		}
		
		return horaire[heure];
	}
	
	public void reserver(int heureDebut, int heureFin, String cours) throws HoraireIncorrect, SalleOccupee {
		if(heureDebut < 8 || heureFin > 19 ) {
			throw new HoraireIncorrect("L'horaire dépasse l'amplitude");
		}
		if(heureDebut == heureFin) {
			throw new HoraireIncorrect("L'heure de début ne peux pas être égale à l'heure de fin");
		}
		
		/**
		 * vérifie que la salle est libre
		 */
		for(int i = heureDebut; i < heureFin; i++) {
			if(!(this.estDisponible(i))) {
				throw new SalleOccupee(this, heureFin, "La salle est occupée");
			}
		}
		
		/**
		 * si aucune exeption levé
		 * ajoute le nom du cours à toutes les heures entre le début et la fin
		 */
		for(int i = heureDebut; i < heureFin; i++) {
			horaire[i] = cours;
		}
	}
	
	
	@Override
	public String toString() {
		StringBuilder h = new StringBuilder();
		for(int i = 8; i < 19; i++) {
			h.append("	" + i + " : ");
			if(horaire[i].isEmpty()) {
				h.append("pas de cours");
			}else {
				h.append(horaire[i]);
			}
			h.append("\n");
		}
		return " Salle numero " + numero + "\n PLanning : \n" + h.toString();
	}
	
	
	
	
}
