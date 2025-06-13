// Classe base Smartphone
class Cliente {
    public String nome;
    public String endereco;
    public String dataNascimento;
    public Double rendaFamiliar;
    public String cpf;
    public String telefone;

    // Construtor da classe Smartphone
    public Cliente(String nome, String endereco,String dataNascimento,Double rendaFamiliar,String cpf, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
        this.rendaFamiliar = rendaFamiliar;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    // Método para exibir as informações do cliente
    public void exibirInformacoes() {
        System.out.println("=================================="); 
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("telefone: " + this.telefone);
        System.out.println("Data Nascimento: " + this.dataNascimento);
        System.out.println("=================================="); 
    }

    // Método para mostrar nome
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Lumia e Samsung
        Cliente cliente1 = new Cliente("Joao", "Sao Paulo - Zona norte", "14/06/1978", 1500.00, "56566998892", "(86)81596-8895");
        Cliente cliente2 = new Cliente("Ze", "Rio Janeiro - Zona norte", "14/06/1978", 1500.00, "8944949499", "(86)81596-8951");

         System.out.println(cliente1.nome);
         System.out.println(cliente1.endereco);
         System.out.println(cliente1.dataNascimento);
         System.out.println(cliente1.cpf);
         System.out.println(cliente1.telefone);
        
         System.out.println(cliente1.getNome());
         cliente1.setNome("Mario");
         cliente1.exibirInformacoes();
             
         System.out.println(cliente2.nome);
         System.out.println(cliente2.endereco);
         System.out.println(cliente2.dataNascimento);
         System.out.println(cliente2.cpf);
         System.out.println(cliente2.telefone);

         cliente2.exibirInformacoes();
    }
}
