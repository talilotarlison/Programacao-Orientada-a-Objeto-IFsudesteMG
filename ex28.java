public class Funcionario{

    double salario;

    public void setSalario(double salario){
        this.salario = salario + 500;    
    }
}


class Analista extends Funcionario{ // Analista é filha de Funcionário, por isso herda todos os seus método e atributos

    @Override // sobrescrita do método setSalario
    public void setSalario(double salario) {
        this.salario = salario + 100; // o nome do método e a referencia recebida são os mesmos, mas a lógica dentro dele é diferente
    }

}