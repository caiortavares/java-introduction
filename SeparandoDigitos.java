import java.sql.SQLOutput;
import java.util.Scanner;

public class SeparandoDigitos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número de 5 dígitos: ");
        int numero1 = input.nextInt();

        System.out.printf("%d%n%n%n%d%n%n%n%d%n%n%n%d%n%n%n%d%n%n%n", numero1);
    }
}
