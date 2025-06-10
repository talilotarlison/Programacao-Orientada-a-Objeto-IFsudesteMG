// dados primitivos em java:
// char - byte - short - int - long - float - double - boolean - string

// Exemplo de uso da classe Scanner 

package pacotel;
import java.util.Scanner;
public class ExemploUsandoClasseScanner {
    public static void main(String[] args) {
        // file fill new File("C:/arq.txt");
        Scanner scan = new Scanner(System.in);
        int num2 = scan.nextInt();
        int num1 = scan.nextInt();
        double num3 = scan.nextDouble();
        System.out.println(num2 + num1);
        System.out.println(num3);
    }
}