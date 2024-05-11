
package uneferme;


public class Courge {
    private float poid ;
    private int  numEmplacement;
    private boolean statut ;// (à la ferme ou vendu)
    
    
    public void changementDePoid(){
    
    }
    public void recuperationDePrix(){
    
    }
    public void testeLegume(){// tester si le légume est prêt pour la vente.
        
    }
}

/*Classe de base Courge :

Définissez une classe de base appelée Courge. Cette classe contiendrait des attributs
communs à toutes les courges (poids, numéro d'emplacement, statut, etc.) et des méthodes communes
pour changer le poids, récupérer le prix, et tester si la courge est prête pour la vente.
Classes dérivées Butternut et Potiron :

Créez des classes dérivées (Butternut et Potiron) qui héritent de la classe de base Courge. 
Ces classes spécialisent les caractéristiques spécifiques à chaque type de courge.
Utilisation du polymorphisme :

Vous pouvez créer une liste (ou tout autre conteneur) d'objets de type Courge. 
Puis, même si certains objets dans cette liste sont de types dérivés comme 
Butternut ou Potiron, vous pouvez les traiter de manière uniforme comme 
des objets de type Courge. C'est là que le polymorphisme entre en jeu.
Par exemple, si vous avez une liste List<Courge> listeDeCourges,
vous pouvez y ajouter des objets Butternut ou Potiron, puis parcourir
la liste en utilisant des méthodes définies dans la classe de base Courge 
sans se soucier spécifiquement du type réel de chaque objet. Cela apporte une 
flexibilité et permet d'ajouter de nouveaux types de courges sans modifier le 
code qui traite les courges de manière générale*/

/*
--------------------------------------------------
/Méthodes toString() et equals() :

Ajoutez la méthode toString() à chaque classe (Courge, Butternut, Potiron) 
pour obtenir une représentation textuelle 
de l'objet. La méthode equals() peut être ajoutée pour comparer deux objets.
Implémentation de la classe GestionCourges :

Cette classe peut contenir une liste (tableau ou ArrayList) 
d'objets de type Courge. Vous pouvez utiliser une liste générale (List<Courge>) 
pour stocker différentes courges, y compris des Butternuts et des Potirons.
Vous implémenterez ensuite les méthodes demandées telles que l'enregistrement
des courges, la recherche par numéro d'emplacement, la vérification de la présence 
d'une courge, le changement de poids, la sélection des légumes prêts à être vendus,
le calcul du prix total et l'affichage des informations.
Implémentation de la classe Ferme :

La classe Ferme peut contenir la méthode main() qui sera le point
d'entrée de votre programme. Dans cette méthode, vous pouvez créer une instance
de GestionCourges, enregistrer des courges, changer leur poids, afficher toutes
les courges, afficher celles prêtes à être vendues, afficher le prix total, etc.
Pour chaque classe (Courge, Butternut, Potiron, GestionCourges, Ferme), vous de
vrez implémenter les méthodes spécifiées, en utilisant les concepts d'héritage
et de polymorphisme lorsque cela est approprié.

Assurez-vous également de tester votre programme en exécutant 
la méthode main() de la classe Ferme pour voir si tout fonctionne correctement.
*/