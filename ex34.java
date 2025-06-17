import java.util.ArrayList; // Importa a classe ArrayList
import java.util.List;    // Importa a interface List

public class GerenciadorClientes {

    public static void main(String[] args) {
        // 1. Criando uma lista de clientes usando ArrayList
        // List é a interface, ArrayList é a implementação concreta
        List<Cliente> listaDeClientes = new ArrayList<>();

        // 2. Adicionando clientes à lista
        Cliente cliente1 = new Cliente("Ana Paula", "111.222.333-44");
        Cliente cliente2 = new Cliente("Bruno Costa", "555.666.777-88");
        Cliente cliente3 = new Cliente("Carla Dias", "999.000.111-22");

        listaDeClientes.add(cliente1); // Adiciona o cliente1 à lista
        listaDeClientes.add(cliente2); // Adiciona o cliente2
        listaDeClientes.add(cliente3); // Adiciona o cliente3

        // 3. Acessando e imprimindo clientes da lista
        System.out.println("--- Clientes na Lista ---");
        for (Cliente cliente : listaDeClientes) { // Loop for-each para percorrer a lista
            System.out.println(cliente); // Irá chamar o método toString() da classe Cliente
        }

        // 4. Acessando um cliente por índice (semelhante a um vetor, mas cuidado!)
        System.out.println("\n--- Acessando por índice ---");
        if (listaDeClientes.size() > 0) {
            Cliente primeiroCliente = listaDeClientes.get(0);
            System.out.println("Primeiro cliente: " + primeiroCliente.getNome() + " (" + primeiroCliente.getCpf() + ")");
        }

        // 5. Removendo um cliente da lista
        listaDeClientes.remove(cliente2); // Remove o cliente2 da lista

        System.out.println("\n--- Clientes após remoção ---");
        for (Cliente cliente : listaDeClientes) {
            System.out.println(cliente);
        }

        // 6. Verificando o tamanho da lista
        System.out.println("\nTotal de clientes na lista: " + listaDeClientes.size());
    }
}