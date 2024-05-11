package gestion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TestGestion {

	@Test
	void TestIsTD() {
		assertTrue(Type.PLATE.isTD());
		assertTrue(Type.HYBRIDE.isTD());
		assertFalse(Type.MACHINE.isTD());
	}

	@Test
	void testIsTP() {
		assertTrue(Type.MACHINE.isTP());
		assertFalse(Type.PLATE.isTP());
		assertTrue(Type.HYBRIDE.isTP());
	}
	
	@Test
	void testConstructeurSalle() {
		Salle salle = new Salle(Type.HYBRIDE, "2129");
		assertEquals(salle.getType(), Type.HYBRIDE);
		assertEquals(salle.getNumero(), "2129");
	}
	
	@Test
	void testEstDisponible() throws HoraireIncorrect {
		Salle s = new Salle(Type.HYBRIDE, "0001");
		assertTrue(s.estDisponible(8));
		assertTrue(s.estDisponible(18));
		
		assertThrows(HoraireIncorrect.class,()->s.estDisponible(7));
		assertThrows(HoraireIncorrect.class,()->s.estDisponible(19));
	}
	
	@Test
	void testGetCours() throws HoraireIncorrect {
		Salle s = new Salle(Type.HYBRIDE, "0001");
		assertEquals(s.getCours(8), null);
		assertEquals(s.getCours(12), null);
		assertEquals(s.getCours(18), null);
		
		assertThrows(HoraireIncorrect.class,()->s.getCours(7));
		assertThrows(HoraireIncorrect.class,()->s.getCours(19));
	}
	
	@Test
	void testReserver() throws HoraireIncorrect, SalleOccupee {
		Salle s = new Salle(Type.HYBRIDE, "0001");
		
		assertThrows(HoraireIncorrect.class, ()->s.reserver(8, 8, "maths"));
		assertThrows(HoraireIncorrect.class, ()->s.reserver(7, 8, "maths"));
		assertThrows(HoraireIncorrect.class, ()->s.reserver(18, 20, "maths"));
		
		assertTrue(s.estDisponible(8));
		assertTrue(s.estDisponible(9));
		s.reserver(8, 10,"maths");
		
		assertThrows(SalleOccupee.class, ()-> s.reserver(8, 10,"anglais"));
		
		assertFalse(s.estDisponible(8));
		assertFalse(s.estDisponible(9));
		assertTrue(s.estDisponible(10));
		
		assertEquals(s.getCours(8), "maths");
		assertEquals(s.getCours(9), "maths");
		
	}
	
	@Test
	void testFindSalle() throws HoraireIncorrect, SalleOccupee {
		Reservation resa = new Reservation();
		for(int i = 8; i<19; i++) {
			assertEquals(resa.findSalle(Type.HYBRIDE, i).getNumero(),"0010");
			assertEquals(resa.findSalle(Type.PLATE, i).getNumero(),"0001");
			assertEquals(resa.findSalle(Type.MACHINE, i).getNumero(),"0011");
		}
		
		ArrayList<Salle> salles = new ArrayList<Salle>();
		salles = resa.getSalles();
		Salle salle1 = salles.get(0);
		Salle salle2 = salles.get(1);
		
		salle1.reserver(8, 10, "maths");
		salle2.reserver(8, 10, "maths");
		assertNull(resa.findSalle(Type.PLATE, 8));
	}
	
}
