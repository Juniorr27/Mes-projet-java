
package aula12;


public abstract class Animal {
    protected float peso;
    protected int idd;
    protected int membros;
    
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    public void affiche(){
        System.out.println("o animal de peso "+ this.getPeso()+" tem "
                + this.getIdd() +" anos et tem "+ this.getMembros()+" membros");
        
    }
}
