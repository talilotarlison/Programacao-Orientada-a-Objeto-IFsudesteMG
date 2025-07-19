public class Cao {
    public void latir() {
        System.out.println("Cão latindo");
    }
}

public class Pinscher extends Cao {
    @Override
    public void latir() {
        System.out.println("Pinscher latindo fininho");
    }
}

// Polimorfismo:
Cao meuCao = new Pinscher();
meuCao.latir(); // Saída: "Pinscher latindo fininho"


// Herança é o mecanismo que permite reutilizar código, enquanto o polimorfismo está relacionado com a capacidade de um objeto assumir muitas formas, geralmente usada com métodos sobrescritos ou interfaces.

//  Herança é um dos principais pilares da programação orientada a objetos. Ela permite que uma classe (subclasse ou filha) herde comportamentos (métodos) e atributos (variáveis) de outra classe (superclasse ou pai).

// As outras opções:
// Agregação → representa uma relação "tem-um", onde uma classe possui outra como parte (ex: um carro tem um motor), mas sem herança.

// Polimorfismo → permite que objetos de classes diferentes respondam de forma diferente ao mesmo método, desde que estejam relacionados por herança ou interfaces.


// Só com extends, você ainda não definiu polimorfismo, dessa forma:

// Para que haja polimorfismo, a subclasse precisa sobrescrever métodos da superclasse (com @Override) ou se referir à subclasse usando uma variável da superclasse.

// O conceito de herança em programação orientada a objetos permite que uma classe (filha ou subclasse) herde atributos e métodos de outra classe (pai ou superclasse).

// Isso promove:

// Reutilização de código

// Organização lógica entre classes

// Facilidade de manutenção e extensão

// Herança = reutilizar código permitindo que uma classe herde atributos e comportamentos de outra.

// Modularidade é o conceito da divisão de um sistema em partes menores e independentes, chamadas de módulos. Cada módulo realiza uma parte específica da tarefa e pode ser desenvolvido, testado e mantido separadamente.

  
