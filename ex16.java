// Exemplo com vetor 

// Java

package exemplos;
import java.util.Scanner;
public class ExemploVetor {
    public static void main(String[] args) {
        // Na próxima linha vou solicitar que o usuário informe a quantidade de
        // dados, lendo essa quantidade para a variável qtd.
        System.out.println("Informe a quantidade de notas a serem digitadas:");
        Scanner scan = new Scanner(System.in);
        int qtd = scan.nextInt();

        // Agora que sei a quantidade vou alocar o vetor do tamanho desejado
        float notas[] = new float[qtd];
        // Vou fazer um laço para ler todas as notas. Note que usei o atributo
        // length como condição de parada do laço.
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota do aluno número " + i + 1);
            notas[i] = scan.nextFloat();
        }
        // Abaixo temos um laço que roda todo o vetor de notas imprimindo na
        // tela todas as notas atribuídas aos alunos.
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota do aluno número " + i + 1 + " foi: " + notas[i]);
        }
    }
}