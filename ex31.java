// A relação entre o Carro e o Motor é uma relação de composição porque o motor faz parte do carro. 
// O motor não pode existir sem o carro (ou pelo menos ele é criado e destruído com o carro). Quando você destrói o carro, o motor também deixa de existir,
//  como acontece em uma composição.

// Esse conceito é diferente da agregação, onde o objeto contido pode existir independentemente do objeto que o contém.

// Classe Motor (parte do Carro)
class Motor {
    private String tipo;

    // Construtor
    public Motor(String tipo) {
        this.tipo = tipo;
    }

    // Método que retorna o tipo do motor
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Motor do tipo: " + tipo;
    }
}

// Classe Carro (composição com Motor)
class Carro {
    private String modelo;
    private Motor motor;  // Composição: Carro tem um Motor

    // Construtor
    public Carro(String modelo, String tipoMotor) {
        this.modelo = modelo;
        this.motor = new Motor(tipoMotor);  // O Motor é criado ao criar o Carro
    }

    // Método para mostrar as informações do carro
    public void mostrarDetalhes() {
        System.out.println("Carro Modelo: " + modelo);
        System.out.println(motor);  // Exibe o motor associado
    }

    // Método getter para acessar o motor (caso necessário)
    public Motor getMotor() {
        return motor;
    }
}

// Classe Principal para testar
public class Main {
    public static void main(String[] args) {
        // Criando um carro, que automaticamente cria um motor
        Carro carro1 = new Carro("Fusca", "1.0");

        // Exibindo os detalhes do carro
        carro1.mostrarDetalhes();
        
        // Quando o carro é destruído, o motor também será destruído (por causa da composição)
    }
}
