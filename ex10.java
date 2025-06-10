// Desvio Condicional (if-else) 

package pacotel;
import java.util.Scanner;
public class ExemploIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a nota: ");
        double nota = scan.nextDouble();
        if (nota < 100 && nota > 0) {
            System.out.println("Nota = " + nota + " (valor válido)");
        } else {
            System.out.println("Nota = " + nota + " (valor inválido)");
        }
    }
}