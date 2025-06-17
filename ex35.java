public class Cliente {
    private String nome;
    private String cpf;

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

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf;
    }
}

import java.util.ArrayList;
import java.util.Iterator; // Importe a classe Iterator
import java.util.List;

public class GerenciadorClientesIterator {

    public static void main(String[] args) {
        List<Cliente> listaDeClientes = new ArrayList<>();

        listaDeClientes.add(new Cliente("Ana Paula", "111.222.333-44"));
        listaDeClientes.add(new Cliente("Bruno Costa", "555.666.777-88"));
        listaDeClientes.add(new Cliente("Carla Dias", "999.000.111-22"));
        listaDeClientes.add(new Cliente("Daniela Alves", "444.555.666-77"));

        System.out.println("--- Clientes na Lista (usando Iterator e While) ---");
        // 1. Obtendo o Iterator da lista
        Iterator<Cliente> iterator = listaDeClientes.iterator();

        // 2. Usando um laço while para percorrer a lista
        while (iterator.hasNext()) { // Verifica se há mais elementos
            Cliente cliente = iterator.next(); // Obtém o próximo elemento
            System.out.println(cliente);
        }

        System.out.println("\n--- Removendo um cliente específico (Ex: Bruno Costa) ---");
        // Para remover um elemento durante a iteração, é *altamente recomendado* usar o Iterator.remove()
        iterator = listaDeClientes.iterator(); // Obtenha um novo iterator para uma nova iteração
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getNome().equals("Bruno Costa")) {
                iterator.remove(); // Remove o elemento atual com segurança
                System.out.println("Cliente " + cliente.getNome() + " removido.");
            }
        }

        System.out.println("\n--- Clientes após a remoção ---");
        iterator = listaDeClientes.iterator(); // Novo iterator para imprimir a lista atualizada
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            System.out.println(cliente);
        }

        System.out.println("\nTotal de clientes na lista: " + listaDeClientes.size());
    }
}