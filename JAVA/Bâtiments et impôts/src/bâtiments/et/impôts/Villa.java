
package bâtiments.et.impôts;

public class Villa extends Batiment {
    private int nbpiece;
    private boolean piscine;
    public Villa(String nomP, String ad, float su,int nbp,boolean p) {
        super(nomP, ad, su);
        nbpiece = nbp;
        piscine = p;
    }
    public Villa(String nomP, String ad, float su) {
        super(nomP, ad, su);
        this.nbpiece = 4;
        this.piscine = false;
    }

    public int getNbpiece() {
        return nbpiece;
    }

    public void setNbpiece(int nbpiece) {
        this.nbpiece = nbpiece;
    }

    public boolean isPiscine() {
        return piscine;
    }

    public void setPiscine(boolean piscine) {
        this.piscine = piscine;
    }
    @Override
     public float  calculImpot(){
        float impotParPiece = 100.0f;
        float impotPiscine = 500.0f;
        // Calcul de l'impôt basé sur le nombre de pièces et la présence de la piscine
        float impotTotal = (nbpiece * impotParPiece) + (piscine ? impotPiscine : 0.0f);

        return impotTotal;
     }
    @Override
    public int getCategorie(){
       return 2;
     
   }
    
    /**
     
     
    public void affiche() {
    super.affiche(); // Appel de la méthode affiche de la classe de base (Batiment)
    
    System.out.println("Nombre de pièces : " + nbpiece);
    System.out.println("Piscine : " + (piscine ? "Oui" : "Non"));
}

    */
}
