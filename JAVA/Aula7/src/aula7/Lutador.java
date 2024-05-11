
package aula7;


public class Lutador {
    private String nome;
    private String nationalidade;
    private int  idade;
    private float altura;
    private float peso ;
    private String categoria;
    private int vitoria;
    private int empates, derotas;
    
    
    public Lutador(String no,String na,int id,float pe,float al,int vi,int em,int de){
        this.nome = no;
        this.nationalidade = na;
        this.idade = id;
        setPeso(pe);
        //this.peso = pe;
        this.vitoria = vi;
        this.empates = em;
        this.derotas = de;
    }
    public void apresentar(){
        System.out.println("---------------------------------------------");
        System.out.println("chegou a hora! Apresetamos o lutador" +this.getNome());
        System.out.println("deiretamente de "+ this.getNationalidade());
        System.out.println("com "+ this.getIdade()+ " anos e " + this.getAltura());
        System.out.println("pesanso "+ this.getPeso()+ " Kg");
        System.out.println(this.getVitoria()+" vitorias");
        System.out.println(this.getDerotas()+" Derotas");
        System.out.println(this.getEmpates()+" Empates");
                
    }
    public void status(){
        System.out.println(this.getNome()+" é um peso "+ this.getCategoria());
        System.out.println("Ganhou "+ this.getVitoria()+ " vezes");
        System.out.println("Empatou "+ this.getEmpates() +" vezes");
        System.out.println("Perdeu "+ this.getDerotas() +" vezes");
        
    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria()+ 1);
    
    }
    public void perderLuta(){
        this.setDerotas(this.getDerotas() +1);
    }
    public void empatar(){
        this.setEmpates(this.getEmpates()+1);
    }

    public int getDerotas() {
        return derotas;
    }

    public void setDerotas(int derotas) {
        this.derotas = derotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNationalidade() {
        return nationalidade;
    }

    public void setNationalidade(String nationalidade) {
        this.nationalidade = nationalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
       
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
       
        if (this.peso < 52.2 ) {
            this.categoria = "invalido";
        } else if (this.peso <=70.3 ) {
            this.categoria = "Leve";
        }else if (this.peso <= 83.9) {
            this.categoria = "Medio";
        } else if(this.peso <= 120.2) {
            this.categoria = "pesado";
        }else {
            this.categoria = "Invalido";
        }
              
 
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
