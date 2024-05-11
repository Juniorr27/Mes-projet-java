
package aula12;


public class Aula12 {

    public static void main(String[] args) {
        
       Mamifero m = new Mamifero();
       Peixe p = new Peixe();
       Reptil r = new Reptil();
       Ave a = new Ave();
       Canguru c = new Canguru();
       Cachorro ca = new Cachorro();
       Cobra co = new Cobra();
       Tartaruga t = new Tartaruga(); 
       Goldfish g = new Goldfish();
       m.setPeso(23.5f);
       m.setMembros(4);
       m.setIdd(5);
       m.setCorPelo("Marrom");
       m.locomover();
       m.emitirSom();
       m.affiche();
       
       System.out.println(" ");
       
       a.setCorPena("branca");
       a.setMembros(4);
       a.setPeso(5);
       a.setIdd(3);
       a.locomover();
       a.emitirSom();
       a.affiche();
       
       c.locomover();
       c.usarBolsa();
       ca.locomover();
       
    }
    
}
