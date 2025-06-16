// Classe Pessoa
class Pessoa {
    private String nome;
    private String cpf;

    // Construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método toString para facilitar a exibição
    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}

// Subclasse Cliente
class Cliente extends Pessoa {
    private String tipoCliente; // Exemplo de atributo adicional para Cliente
    private double rendaFamiliar;

    // Construtor
    public Cliente(String nome, String cpf, String tipoCliente, double rendaFamiliar) {
        super(nome, cpf);
        this.tipoCliente = tipoCliente;
        this.rendaFamiliar = rendaFamiliar;
    }

    // Getter e Setter
    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    // Método toString para exibir as informações do Cliente
    @Override // sobreescrita do metodo - polimofimos
    public String toString() {
        return super.toString() + ", Tipo Cliente: " + tipoCliente + " Renda: " + rendaFamiliar;
    }
    
    public double rendaFamiliarCliente(){
        return this.rendaFamiliar;
    }
}

// Subclasse Vendedor
class Vendedor extends Pessoa {
    private String areaVendas; // Exemplo de atributo adicional para Vendedor

    // Construtor
    public Vendedor(String nome, String cpf, String areaVendas) {
        super(nome, cpf);
        this.areaVendas = areaVendas;
    }

    // Getter e Setter
    public String getAreaVendas() {
        return areaVendas;
    }

    public void setAreaVendas(String areaVendas) {
        this.areaVendas = areaVendas;
    }

    // Método toString para exibir as informações do Vendedor
    @Override
    public String toString() {
        return super.toString() + ", Área de Vendas: " + areaVendas;
    }
}

// Classe principal para testar as classes
public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Cliente e Vendedor
        Cliente cliente = new Cliente("João Silva", "123.456.789-00", "Premium", 1500.00);
         System.out.println(cliente.rendaFamiliarCliente());
        Vendedor vendedor = new Vendedor("Maria Oliveira", "987.654.321-00", "Eletrônicos");

        // Exibindo as informações
        System.out.println(cliente);
        System.out.println(vendedor);
    }
}
