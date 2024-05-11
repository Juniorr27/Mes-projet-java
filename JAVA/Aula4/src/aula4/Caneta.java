
package aula4;

public class Caneta {
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    public  String getModelo(){
        return this.modelo;
    }
    /*
    public  Caneta(){ //este é o metodo construtor
        this.tampar();
        this.cor = "Azul";
    }*/
     public  Caneta(String m, String c, float p){ //este é o metodo construtor
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
        this.cor = "Azul";
    }
    public void setModelo(String m){
      this.modelo = m ; 
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p ){
        this.ponta = p;
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
    
    public void stutus(){
        System.out.println("Sobre caneta : ");
        System.out.println("Modelo" + this.modelo);
        // ou
        //System.out.println("Modelo" + this.getModelo());
        System.out.println("ponta : " + this.ponta);
        //System.out.println("ponta : " + this.getPonta();
        System.out.println("cor : " + this.cor);
        System.out.println("tamapada : " + this.tampada);
              
    }
    
    
}
