
package aula10;


public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void canselarMatricula(){
        System.out.println("Matricula sera cancelada");
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

    public void status(){
        System.out.println(" o curso do aluno est "+ this.getCurso());
    }
    
    
}
