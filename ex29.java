// Herança 
// Assiciação :
// 1 - tipo n pra n 
// 2 - tipo 1 pra n 
// 3 - tipo 1 pra 1
// Composição


// associação na pratica em POO

// Definindo a classe Aluno
class Aluno {
    private String nome;
    private int idAluno;

    // Construtor
    public Aluno(String nome, int idAluno) {
        this.nome = nome;
        this.idAluno = idAluno;
    }

    // Métodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + " (ID: " + idAluno + ")";
    }
}

// Definindo a classe Professor
class Professor {
    private String nome;
    private int idProfessor;

    // Construtor
    public Professor(String nome, int idProfessor) {
        this.nome = nome;
        this.idProfessor = idProfessor;
    }

    // Métodos getter e setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    @Override
    public String toString() {
        return "Professor: " + nome + " (ID: " + idProfessor + ")";
    }
}

// Definindo a classe Matricula
class Matricula {
    private Aluno aluno;
    private Professor professor;
    private String disciplina;

    // Construtor
    public Matricula(Aluno aluno, Professor professor, String disciplina) {
        this.aluno = aluno;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    // Métodos getter e setter
    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Matrícula: " + aluno + " - Professor: " + professor + " - Disciplina: " + disciplina;
    }
}

// Classe principal para testar a associação
public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Aluno e Professor
        Aluno aluno1 = new Aluno("João Silva", 101);
        Professor professor1 = new Professor("Maria Oliveira", 201);

        // Criando uma matrícula associando aluno e professor
        Matricula matricula1 = new Matricula(aluno1, professor1, "Matemática");

        // Imprimindo a matrícula
        System.out.println(matricula1);
    }
}
