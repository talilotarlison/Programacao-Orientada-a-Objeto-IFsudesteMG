// Classe base Smartphone
class Smartphone {
    private String modelo;
    private String marca;
    private int anoDeLancamento;

    // Construtor da classe Smartphone
    public Smartphone(String modelo, String marca, int anoDeLancamento) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoDeLancamento = anoDeLancamento;
    }

    // Método para exibir as informações do smartphone
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    // Método para mostrar a apresentação padrão do smartphone
    public void apresentar() {
        System.out.println("Eu sou um smartphone da marca " + marca + ", modelo " + modelo + ", lançado em " + anoDeLancamento + ".");
    }
}

// Classe derivada Lumia que herda de Smartphone
class Lumia extends Smartphone {
    // Construtor do Lumia, chamando o construtor da classe base Smartphone
    public Lumia(String modelo, int anoDeLancamento) {
        super(modelo, "Nokia", anoDeLancamento); // Marca fixa como Nokia
    }

    // Sobrescrita do método para uma apresentação específica do Lumia
    @Override
    public void apresentar() {
        System.out.println("Eu sou um modelo Nokia Lumia.");
    }
}

// Classe derivada Samsung que herda de Smartphone
class Samsung extends Smartphone {
    // Construtor do Samsung, chamando o construtor da classe base Smartphone
    public Samsung(String modelo, int anoDeLancamento) {
        super(modelo, "Samsung", anoDeLancamento); // Marca fixa como Samsung
    }

    // Sobrescrita do método para uma apresentação específica do Samsung
    @Override
    public void apresentar() {
        System.out.println("Eu sou um modelo Samsung.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Lumia e Samsung
        Lumia lumia920 = new Lumia("Lumia 920", 2012);
        Samsung galaxyS3 = new Samsung("Galaxy S3", 2012);

        // Chamando o método apresentar() para cada smartphone
        lumia920.apresentar();  // Saída: Eu sou um Nokia Lumia, modelo Lumia 920, lançado em 2012.
        galaxyS3.apresentar();   // Saída: Eu sou um Samsung, modelo Galaxy S3, lançado em 2012.

        // Chamando o método exibirInformacoes() para cada smartphone
        lumia920.exibirInformacoes();
        galaxyS3.exibirInformacoes();
    }
}
