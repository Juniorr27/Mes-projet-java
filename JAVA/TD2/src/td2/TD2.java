
package td2;

public class TD2 {

 
    public static void main(String[] args) {
      Personne p = new Personne("louis","Ville",25); 
      Personne c = new Personne("louanne","Village",61);
      Personne d = new Personne("marc", "cite", 12);
      
      Personne[] per = {p,c,d}; 
      /*for(Personne personne:per ){
          System.out.println("Nom :"+ personne.getNom());
          System.out.println("Adresse "+personne.getAdresse());
          System.out.println("Catégorie d'âge: "+ personne.categorieDAge());
          System.out.print("Catégorie de résidence: ");
          personne.categorieDeResidence();
          System.out.println("");
      }*/
      // OU
        for (int i = 0; i < per.length; i++) {
            System.out.println("Nom :" + per[i].getNom());
            System.out.println("Adresse "+per[i].getAdresse());
            System.out.println("Catégorie d'âge: "+ per[i].categorieDAge());
            System.out.print("Catégorie de résidence: ");
            per[i].categorieDeResidence();
            System.out.println("");
        }
      
      int[] tab = p.monTab();
        System.out.println(" éléments mdodifiés du tableau ");
        for (int i = 0; i < 4; i++) {
            System.out.println(" éléement à l'index " + i+ ":"+ tab[i]);
        }
    }
    
    
}
