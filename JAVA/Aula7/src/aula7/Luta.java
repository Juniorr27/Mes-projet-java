   
package aula7;

import java.util.Random;


public class Luta {
      private Lutador desafiado ;
    private Lutador desafiante ;
    private int rounds;
    private boolean aprovada;
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals (l2.getCategoria())&& l1 !=l2 ){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovada = false;
             this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar(){
        if (this.aprovada) {
            System.out.println("#####Desafiado######");
            this.desafiado.apresentar();
            System.out.println("#####Desafiante######");
            this.desafiante.apresentar();
            Random alea = new Random();
            int vencedor = alea.nextInt(3);//0 1 2
            switch(vencedor){
            case 0: //Empate
                System.out.println("Empatou");
                this.desafiado.empatar();
                this.desafiante.empatar();
                break;
            case 1:// desafiado vence
                System.out.println(" Vitoria do "+ this.desafiado);
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
            case 2:// deasfiante vence
                System.out.println("Vitoria do "+ this.desafiante);
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
            }
        }else{
            System.out.println("A luta nao pode acontecer ");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }


    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }


    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

  




}
