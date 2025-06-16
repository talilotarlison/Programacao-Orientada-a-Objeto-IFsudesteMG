// Um enum (abreviação de enumeration) é um tipo especial de classe que representa um conjunto fixo de constantes — ou seja, valores que não mudam durante a execução do programa.

// Para que serve?
// Você usa um enum quando precisa representar um conjunto de valores possíveis bem definidos e limitados. Isso melhora:

// Legibilidade do código

// Segurança de tipo (o compilador verifica os valores)

// Organização (em vez de usar String ou int soltos)

enum DiaDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
}

public class TesteEnum {
    public static void main(String[] args) {
        DiaDaSemana hoje = DiaDaSemana.SEXTA;

        if (hoje == DiaDaSemana.SEXTA) {
            System.out.println("Sextou! 😎");
        }
    }
}
