import java.sql.SQLOutput;
import java.util.Scanner;

public class SeparandoDigitos {
    public static void main(String[] args) {
        int valor;
        int resultado1;
        int resto1;
        int resultado2;
        int resto2;
        int resultado3;
        int resto3;
        int resultado4;
        int resto4;
        int resultado5;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número de 5 dígitos: ");
        valor = input.nextInt();

        resultado1 = valor / 10000;
        resto1 = valor % 10000;

        resultado2 = resto1 / 1000;
        resto2 = resto1 % 1000;

        resultado3 = resto2 / 100;
        resto3 = resto2 % 100;

        resultado4 = resto3 / 10;
        resto4 = resto3 % 10;

        resultado5 = resto4;

        System.out.printf("%d, %d, %d, %d, %d",resultado1, resultado2, resultado3, resultado4, resultado5);
    }
}
