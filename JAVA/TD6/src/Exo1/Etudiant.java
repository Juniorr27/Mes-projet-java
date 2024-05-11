package Exo1;

public class Etudiant {
	private static int etuPass = 21800001;
    private String formation; 
    private String nom; 
    private String prenom; 
    private double noteMoyenneUE1; 
    private double noteMoyenneUE2; 
    private int ID;
    
     public Etudiant(String formation, String nom, String prenom) { 
    	  this.formation = formation; 
          this.nom = nom; 
          this.prenom = prenom; 
          noteMoyenneUE1 = 0.0; 
          noteMoyenneUE2 = 0.0; 
          ID = etuPass; 
          etuPass++; 
     }
     public void setNoteMoyenneUE(int unite, int [] notesUE){
    	 double somme = 0.0;  
    	 if(notesUE.length > 0){ 
    		 somme = notesUE[0];
    	 }
    	 for(int n = 1; n < notesUE.length; n++){ 
    		 somme += notesUE[n]; 
    		 } 
    	 if(unite == 1){ 
    		 this.noteMoyenneUE1 = somme; 
    	 }else if(unite == 2){ 
    		 this.noteMoyenneUE2 = somme; 
    	 } 
    	    	 
     }
     
      public String toString(){ 
    	  return this.ID+": "+this.nom+", "+this.prenom+", Étudiant "
    	  		+ ""+this.formation+", UE1: "+this.noteMoyenneUE1+", UE2:  "
    	  	    + " "+this.noteMoyenneUE2; 
      }
	public int getID() {
		
		return 0;
	}
}
