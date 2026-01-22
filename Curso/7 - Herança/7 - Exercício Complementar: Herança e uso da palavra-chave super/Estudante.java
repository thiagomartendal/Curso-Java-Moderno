class Estudante extends Pessoa {
    private int matricula;

    Estudante(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    
    public void info() {
        System.out.println("Informações do Estudante");
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
        System.out.println("Matrícula: " + matricula);
    }
}