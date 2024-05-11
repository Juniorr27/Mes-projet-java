
package aula5;

public class Banco {
    public int numConta;
    protected   String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    public Banco(){ 
        /*chaque foid que j vais ouvrirun compte 
        j'aurais ces informations */
        this.saldo = 0;
        this.status = false;
    
    }
    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return numConta ;
    }
    public void setTipo(String t){
        this.tipo = t;
    }
    
    public void abrirConta(){
      if(){
      
      }
      if(this.status == true){
          System.out.println(" conta abeta");
      }else{
           System.out.println(" conta fechada");
      }
    }
    
    public void fcharConta(){
    if(this.saldo == 0){
         System.out.println(" conta fechada");
    }else{
         System.out.println(" nao pode fechar conta ");
    }
    }
    
    public void depositar(){
         if(this.status == true){
         
         }
    }
    public void sacar(){
         if((this.status == true)|| (this.saldo > 0)){
         
         }
    
    }
    public void pagarMensal(){
        this.saldo - 12;
    }
    
    
    
    
}
