// Classe Coração
// Composição em Java
public class Coracao {
    boolean batendo;

    public Coracao() {
        this.batendo = true;
    }
}

// Classe Pessoa (composição: cria o coração internamente)
public class Pessoa {
    String nome;
    Coracao coracao;

    public Pessoa(String nome) {
        this.nome = nome;
        this.coracao = new Coracao(); // Coração faz parte da pessoa
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João");

        System.out.println("Pessoa: " + pessoa.nome);
        System.out.println("Coração batendo? " + pessoa.coracao.batendo);
    }
}
