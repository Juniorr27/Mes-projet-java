
package aula10;


public class Aula10 {

    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(); 
        Aluno p2 = new Aluno();
        Profesor p3 = new Profesor();
        Funcionaria p4 = new Funcionaria();
        p1.setNom("pedro");
        p2.setNom("paul");
        p3.setNom("Mario");
        p4.setNom("Paula");
        p2.setIdade(18);
        p3.setIdade(30);
        p1.setIdade(20);
        p1.setSexo("M");
        p2.setSexo("M");
        p2.setCurso("math");
        p2.status();
        p3.setSalario(2050.25f);
        p4.setSetor("Estoque");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
