
package aula11;

public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    public void pagarMensalidade(){
        System.out.println("pagar mensalidade du aluno "+ this.getNom());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    @Override
    public String toString() {
        return "Dados do Aluno{" + "matricula=" + matricula + ", curso=" + curso + '}';
    }
    
}
