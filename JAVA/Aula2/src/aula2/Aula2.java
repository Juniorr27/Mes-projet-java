
package aula2;
public class Aula2 {

    public static void main(String[] args) {
      Caneta c1 = new Caneta();
      c1.cor = "azul";
      c1.ponta = 0.5f;
      c1.destampar();
      c1.rabiscar();
      c1.status();
      
      Caneta c2 = new Caneta();
      c2.modelo = "Bic";
      c2.cor = "preta" ;
      c2.destampar();
      c2.rabiscar();
    }
    
}
