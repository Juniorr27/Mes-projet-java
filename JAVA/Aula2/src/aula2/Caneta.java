
package aula2;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.println("modelo :"+ this.modelo);
        System.out.println("uma caneta "+ this.cor);
        System.out.println("caraga :"+ this.carga);
        System.out.println("tampada ? "+ this.tampada);
        System.out.println("ponta : "+ this.ponta);
    
    }
    void rabiscar() {
      if (this.tampada == true){
          System.out.println("ERRO ! nao posso rabiscar ");
      }else{
          System.out.println("Estou Rabiscando");
      }
    }
    void tampar(){
         this.tampada = true;
         // ça veut dire c1.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
    
}
