// Em programação orientada a objetos, override, ou sobrescrita, é um recurso que permite que uma subclasse forneça sua própria implementação de um método 
// que já existe na classe pai (superclasse). Isso significa que, quando um objeto da subclasse chama esse método, a versão definida na subclasse é executada, 
// em vez da versão da superclasse. 

// O que acontece no override:

// Reescrita da lógica:
// O método na subclasse tem a mesma assinatura (nome, tipo de retorno e parâmetros) do método na superclasse, mas pode ter uma implementação diferente, 
// adaptada às necessidades da subclasse.

// Polimorfismo:
// O override é um exemplo de polimorfismo, que significa "muitas formas". Ele permite que o mesmo método se comporte de maneira diferente dependendo do
// tipo de objeto que o chama.

// Herança:
// O override é possível graças ao conceito de herança, onde as subclasses herdam atributos e métodos da superclasse. 


class Animal {
    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }
}

class Cachorro extends Animal {
    @Override // Indica que estamos sobrescrevendo o método emitirSom()
    public void emitirSom() {
        System.out.println("Au au!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();

        animal.emitirSom(); // Imprime: Som genérico de animal
        cachorro.emitirSom(); // Imprime: Au au!
    }
}

// Neste exemplo, a classe Cachorro herda o método emitirSom() da classe Animal, mas a sobrescreve para fornecer sua própria implementação específica. 
// Quando chamamos emitirSom() em um objeto Cachorro, a versão sobrescrita é executada, demonstrando o override. 

// Anotação @Override:

// Em algumas linguagens, como Java, é comum usar a anotação @Override antes do método sobrescrito. Essa anotação não é obrigatória,
//  mas ajuda a garantir que o método realmente está sobrescrevendo um método da superclasse e ajuda o compilador a detectar erros de digitação na assinatura do método. 
// Em resumo, o override é uma ferramenta poderosa para reutilizar código e adaptar o comportamento de métodos herdados em subclasses, 
// tornando a programação orientada a objetos mais flexível e reutilizável. 