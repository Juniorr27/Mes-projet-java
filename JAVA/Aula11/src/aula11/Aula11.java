
package aula11;

public class Aula11 {

  
    public static void main(String[] args) {
     // Pessoa p1= new Pessoa();
    Visitante v1 = new Visitante();
    v1.setNom("juju");
    v1.setIdade(15);
    v1.setSexo("M");
    System.out.println(v1.toString());
    Aluno a1 = new Aluno();
    a1.setNom("pedro");
    a1.setIdade(18);
    a1.setCurso("math");
    a1.setMatricula(1233);
    a1.setSexo("M");
    System.out.println(a1.toString());
    System.out.println(a1.toString());
    a1.pagarMensalidade();
    Bolsista b1 = new Bolsista();
    b1.setMatricula(2555);
    b1.setNom("maria");
    b1.setBolsa(633f);
    b1.pagarMensalidade();
    }
    
}
