package Exo2;

public class B implements InterfaceValeur {
	 private String couleur; 
	 public B(String c) { 
		 this.couleur=c; 
	 }
	  public int valeur() {  
		  if (couleur.equals("rouge")) 
			  return 1; 
		  else return -1; 
	  }
	   public String toString() { 
		   return "("+couleur+")"; 
		   } 
	   public int valeurBis() {  
		   return 2*valeur(); 
	   }
}
