
package aula2;

public class Caneta {
   public String modelo;
   public String cor;
   private float ponta;
   protected int carga;
   private boolean tampada;
   public void status() {
        System.out.println("modelo :"+ this.modelo);
        System.out.println("uma caneta "+ this.cor);
        System.out.println("caraga :"+ this.carga);
        System.out.println("tampada ? "+ this.tampada);
        System.out.println("ponta : "+ this.ponta);
    
    }
    public void rabiscar() {
       if (this.tampada == true){
           System.out.println("ERRO ! nao posso rabiscar ");
       }else{
           System.out.println("Estou Rabiscando");
       }
     }
    protected void tampar(){
         this.tampada = true;
         // ça veut dire c1.tampada = true;
    }
    protected void destampar() {
        this.tampada = false;
    }
    
}
