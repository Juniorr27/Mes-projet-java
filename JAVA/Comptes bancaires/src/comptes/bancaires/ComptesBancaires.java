
package comptes.bancaires;
import java.util.Scanner;
public class ComptesBancaires {

    
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       /*Compte compte1 = new Compte ("A01", 1000f);
       CompteEpargne compte2;
       compte2 = new CompteEpargne ("E99", 1000f, 0.1f);
       compte2.setNbAnneEpargne(5);
       Compte c;
       String message = "L'argent qui dort ne rapporte rien :";
       c = compte1;
       message += "\n Solde compte " + c.getIdentificateur()+ " : " 
               + c.getSolde() + " "+c.getNatureCompte();
       c = compte2; 
       message += "\n Solde compte "  + c.getIdentificateur()+ " : " 
               + c.getSolde() + " "+c.getNatureCompte(); 
       System.out.println(message); 
     */
    // Créez une instance de la classe Compte en utilisant la méthode creerCompte
    //Compte compte1 = creerCompte(obj);
    
    // Créez une instance de la classe CompteEpargne en utilisant la méthode creerCompte
  //  Compte compte2 = creerCompte(obj);

    // Fermez le scanner après utilisation
    obj.close();
    }
    
}
