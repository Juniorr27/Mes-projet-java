package Exo2;

public class A implements InterfaceValeur  {
	private int nombre;

	public A(int nombre) {
		super();
		this.nombre = nombre;
	}
	
	public int valeur(){ 
		return nombre; 
	}
    public String toString() { 
		return "("+nombre+")"; 
	}
     public int valeurBis() { 
    	 return 5*valeur(); 
     }
}
