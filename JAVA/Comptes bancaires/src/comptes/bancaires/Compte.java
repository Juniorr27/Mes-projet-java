
package comptes.bancaires;
import java.util.Scanner;

public class Compte {
    private String identificateur;
    private float solde;
    private Compte[] tableauDeComptes;
    public Compte(String id, float sol){
        this.identificateur = id;
        this.solde = sol;
    }

    public String getIdentificateur() {
        return identificateur;
    }

    public void setIdentificateur(String identificateur) {
        this.identificateur = identificateur;
    }

    public float getSolde() {
        return solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }
    
    public String getNatureCompte(){
        return "compte simple";
    }
    
    Scanner obj = new Scanner(System.in);
    
    public Compte creerCompte(Scanner obj){
        System.out.println(" voule vous creer un compte normale ou un compte"
                + " Epargne? "); 
        System.out.println("Entrez 1 pour le compote Simple et 0 pour un compte"
                + " Epargne");
        int choix = obj.nextInt();
        if(choix == 1){
            System.out.println(" Entrez votre Identifiant");
            String id = obj.next();
            System.out.println("Entre votre solde");
            float sol = obj.nextFloat();
            return  new Compte(id,sol);
        }else if(choix == 0){
            System.out.println(" Entrez votre Identifiant");
            String ide = obj.next();
            System.out.println("Entre votre solde");
            float sold = obj.nextFloat();
            System.out.println("Entrez votre taux d'interé");
            float TIA = obj.nextFloat();
            return new CompteEpargne(ide,sold,TIA);
        }
        obj.close();
        return null;
    }
    
}
