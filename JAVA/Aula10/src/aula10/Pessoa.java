
package aula10;

public class Pessoa {
    private String nom;
    private int idade;
    private String sexo;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    
    public void fazerAniversario(){
        this.idade ++;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nom = " + nom + ", idade = " + idade + ", sexo  =  " + sexo + '}';
    }
    
}
