# Sobrecarga de Métodos (Overloading)

A **sobrecarga de métodos**, também conhecida como _overloading_, é um recurso da programação orientada a objetos que permite definir múltiplos métodos com o mesmo nome em uma classe, mas com diferentes listas de parâmetros (assinaturas). Isso significa que, ao chamar um método com o mesmo nome, o compilador ou interpretador decidirá qual versão do método executar com base nos argumentos fornecidos.

## Conceito

Em essência, a sobrecarga de métodos permite que você reutilize o mesmo nome de método para realizar operações similares, mas com diferentes tipos ou quantidades de dados de entrada. Por exemplo, você pode ter um método chamado `calcularArea` que aceita diferentes tipos de argumentos, como:

- `calcularArea(int raio)`: para calcular a área de um círculo.
- `calcularArea(int largura, int altura)`: para calcular a área de um retângulo.
- `calcularArea(double base, double altura)`: para calcular a área de um triângulo.

O compilador/interpretador irá determinar qual versão do método `calcularArea` invocar com base nos argumentos passados na chamada do método.

## Benefícios da Sobrecarga

### Legibilidade

Facilita a leitura e compreensão do código, pois métodos com nomes semelhantes podem realizar operações relacionadas.

### Reutilização de código

Permite reutilizar o mesmo nome de método para diferentes cenários, evitando a criação de métodos com nomes confusos.

### Polimorfismo

A sobrecarga é um tipo de polimorfismo, que é a capacidade de um objeto responder de maneiras diferentes a uma mesma mensagem (chamada de método).

## Diferença entre Sobrecarga e Sobrescrita

É importante não confundir **sobrecarga** com **sobrescrita** (_overriding_). Enquanto a sobrecarga ocorre em uma única classe e permite definir múltiplos métodos com o mesmo nome e diferentes parâmetros, a sobrescrita ocorre em classes diferentes (herança) e permite que uma subclasse forneça sua própria implementação de um método já definido em sua superclasse, utilizando a mesma assinatura (nome e parâmetros).

---

**Em resumo:**  
A sobrecarga de métodos é uma ferramenta útil para criar código mais flexível e legível, permitindo que você defina múltiplos métodos com o mesmo nome, mas com diferentes listas de parâmetros, para lidar com diversas situações de uso.
