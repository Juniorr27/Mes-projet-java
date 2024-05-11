
package petitexercicei;

public class Voiture {
    private String nom;
    private int puissance;
    private int nbcoursGagne;
    private int nbcoursPerdu;
    private String categorie;
    private float kmh;
    private String marque;
    public Voiture(String no,int pu, int nbcg, int nbcp,String ca,float
            kmh,String ma){
        nom = no;
         puissance = pu;
        nbcoursGagne = nbcg;
        categorie = ca;
        marque = ma;
        this.kmh = kmh;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getNbcoursGagne() {
        return nbcoursGagne;
    }

    public void setNbcoursGagne(int nbcoursGagne) {
        this.nbcoursGagne = nbcoursGagne;
    }

    public int getNbcoursPerdu() {
        return nbcoursPerdu;
    }

    public void setNbcoursPerdu(int nbcoursPerdu) {
        this.nbcoursPerdu = nbcoursPerdu;
    }

    public String getCategorie() {
        if (this.puissance < 130 ){
            System.out.println("Cette voiture ne peut pas participer au course "
                    + "car elle manque de puissance ");
        } else { if (this.puissance >= 2000) {
                this.categorie = " Tres puissante";
            }else if (this.puissance <= 500 ) {
                this.categorie = " Puissance Moyenne";
            }else if (this.puissance <= 1000) {
                this.categorie = "Assez puissante";
                
            }
        }
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public float getKmh() {
        return kmh;
    }

    public void setKmh(float kmh) {
        this.kmh = kmh;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
    
    
    
    
    
}
