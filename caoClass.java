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

// Só com extends, você ainda não definiu polimorfismo.

// Para que haja polimorfismo, a subclasse precisa sobrescrever métodos da superclasse (com @Override) ou se referir à subclasse usando uma variável da superclasse.
