
package aula10;


public class Funcionaria extends Pessoa {
       private String setor;
       private boolean trabalhando;
       
       public void mudarTRabalho(){
         this.trabalhando = !this.trabalhando; 
       }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
       
    
}
