package gestion;

@SuppressWarnings("serial")
public class SalleOccupee extends Exception{
	Salle salle;
	int heure;
	
	public SalleOccupee(Salle salle, int heure, String message) {
		super(message);
		this.salle = salle;
        this.heure = heure;
	}
	
	public Salle getSalle() {
        return salle;
    }

    public int getHeure() {
        return heure;
    }
    
    @Override
	public String getMessage() {
    	return "salle" + salle.getNumero() + "occupée";
    }
}
