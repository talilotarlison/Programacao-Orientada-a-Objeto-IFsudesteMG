// Classe Professor
// Agregação em Java
public class Professor {
    String nome;

    public Professor(String nome) {
        this.nome = nome;
    }
}

// Classe Universidade (agrega professores)
import java.util.ArrayList;

public class Universidade {
    String nome;
    ArrayList<Professor> professores;

    public Universidade(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor); // Associação com objeto externo
    }
}

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Ana");
        Universidade ufp = new Universidade("UFP");

        ufp.adicionarProfessor(prof1);

        System.out.println("Universidade: " + ufp.nome);
        System.out.println("Professor agregado: " + ufp.professores.get(0).nome);
    }
}
