
package aula12;

public class Reptil extends Animal{
    private String corEscama;
    @Override
    public void locomover() {
        System.out.println("Rastjando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetas");
    }

    @Override
    public void emitirSom() {
        System.out.println("som  de reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
