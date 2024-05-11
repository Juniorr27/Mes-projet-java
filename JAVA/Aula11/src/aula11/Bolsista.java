
package aula11;

public class Bolsista extends Aluno {
    private float bolsa; 
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de "+ this.getNom());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNom()+" é bolsista ! pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
    
}
