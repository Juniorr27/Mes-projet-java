
package aula6;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //Métodos especias
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    public void setVolume( int v){
        this.volume = v;
    }
    public int getVolume() {
        return volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    // Métode abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abriMenu() {
        System.out.println("---------Menu--------");
        System.out.println("Esta ligado? "+ this.getLigado() );
        System.out.println("esta tocando? "+ this.getTocando());
        System.out.println("Volume: "+ this.getVolume() );
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.printf("|"); 
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("fechar volume ");
    }

    @Override
    public void maisVolume() {
        //so vai aumentar volume se a tv estiver ligado
        if (this.getLigado()) {
            this.setVolume(this.getVolume()+5 );
        }else{
           System.out.println("impossivel aumentar volume a tv esta desligada");
       } 
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado()&& this.getVolume() > 0 ) {
            this.setVolume(0);
        }
    }

    @Override
    public void menoVolume() {
       if (this.getLigado()) {
            this.setVolume(this.getVolume()-5 );
        }else{
           System.out.println("impossivel aumentar volume a tv esta desligada");
       } 
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0 ) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
           this.setTocando(true);
        }else{
            System.out.println("nao consigui reproduir a tv esta desligada");
        }
        
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }else{
            System.out.println("nao consigui pausar a tv esta desligada ");
        }
    }
    
  
}
