public class ExemploVetorNotas {

    public static void main(String[] args) {
        // 1. Criando um vetor de 10 posições para armazenar notas
        double[] notas = new double[10];

        // 2. Atribuindo valores a posições específicas do vetor
        // nota zero recebe (implícito, aqui seria notas[0])
        notas[0] = 10.0; // Exemplo de atribuição para a primeira posição
        notas[1] = 9.0;  // Exemplo de atribuição para a segunda posição
        notas[2] = 9.5;  // Outro exemplo
        // ... você continuaria preenchendo as outras posições se necessário

        // 3. Percorrendo todos os elementos do vetor com um laço for
        System.out.println("Notas no vetor:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + " ");
        }
    }
}