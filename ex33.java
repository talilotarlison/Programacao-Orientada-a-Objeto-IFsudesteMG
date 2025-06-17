public class Cliente {
    private String nome;
    private String cpf;
    // Outros atributos do cliente (email, endereço, telefone, etc.)

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Getters e setters para outros atributos
}

public class ExemploVetorCliente {
    public static void main(String[] args) {
        // Criando um vetor de clientes
        Cliente[] clientes = new Cliente[10]; // Vetor para 10 clientes

        // Criando objetos Cliente e adicionando ao vetor
        clientes[0] = new Cliente("João da Silva", "123.456.789-00");
        clientes[1] = new Cliente("Maria Souza", "987.654.321-11");
        // ... adicione mais clientes

        // Acessando informações do cliente no vetor
        System.out.println("Nome do primeiro cliente: " + clientes[0].getNome()); // [00:28:05]
        System.out.println("CPF do primeiro cliente: " + clientes[0].getCpf()); // [00:28:05]

        // Imprimindo todos os clientes (isso imprimirá o tipo do objeto, não os atributos) [00:27:45]
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i]);
        }
    }
}