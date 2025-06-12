// Classe base Pessoa
class Pessoa {
    private String nome;
    private int idade;

    // Construtor da classe Pessoa
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método de apresentação da pessoa
    public String apresentacao() {
        return "Olá, eu sou uma Pessoa.";
    }
}

// Classe derivada Estudante que herda de Pessoa
class Estudante extends Pessoa {
    private String curso;

    // Construtor da classe Estudante
    public Estudante(String nome, int idade, String curso) {
        // Chama o construtor da classe base Pessoa
        super(nome, idade);
        this.curso = curso;
    }

    // Sobrescreve o método de apresentação da classe base
    @Override
    public String apresentacao() {
        return "Olá, eu sou estudante.";
    }
}

// Classe derivada professor que herda de Pessoa
class Professor extends Pessoa {
    private String materia;

    // Construtor da classe Estudante
    public Professor(String nome, int idade, String materia) {
        // Chama o construtor da classe base Pessoa
        super(nome, idade);
        this.materia = materia;
    }

    // Sobrescreve o método de apresentação da classe base
    @Override
    public String apresentacao() {
        return "Olá, eu sou Professor.";
    }
}


public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Pessoa e Estudante
        Pessoa pessoa = new Pessoa("João", 40);
        Estudante estudante = new Estudante("Ana", 22, "Engenharia");
        Professor professor = new Professor("Maicon", 28, "Calculo I");

        // Chamando o método de apresentação
        System.out.println(pessoa.apresentacao());  // Saída: Olá, meu nome é João e eu tenho 40 anos.
        System.out.println(estudante.apresentacao());  // Saída: Olá, meu nome é Ana, eu tenho 22 anos e estou cursando Engenharia.
        System.out.println(professor.apresentacao());
    }
}
