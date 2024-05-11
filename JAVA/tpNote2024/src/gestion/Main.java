package gestion;

public class Main {

	public static void main(String[] args) throws HoraireIncorrect, SalleOccupee {
		
		Salle s = new Salle(Type.HYBRIDE, "222");
		s.reserver(8, 10,"maths");
		System.out.println(s);
		
		Reservation a = new Reservation();
		a.saisirCours();
	}

}
