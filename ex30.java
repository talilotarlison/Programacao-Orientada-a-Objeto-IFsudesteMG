// A composição em Java é um tipo de associação entre objetos onde um objeto contém uma instância de outro objeto como parte de sua estrutura. 
// Ao contrário da associação simples (onde um objeto pode existir sem depender do outro), na composição, o ciclo de vida dos objetos envolvidos 
// é mais rígido — ou seja, quando o objeto "pai" é destruído, o objeto "filho" também é destruído.

// Um exemplo clássico de composição pode ser representado com uma classe Carro e uma classe Motor. O Carro tem um Motor, e o motor não 
// pode existir sem o carro. Quando o carro é destruído, o motor também será destruído.

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
