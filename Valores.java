import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int n4;
        int n5;

        int positivo = 0;
        int negativo = 0;
        int zero = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        n3 = input.nextInt();
        System.out.print("Digite o quarto número: ");
        n4 = input.nextInt();
        System.out.print("Digite o quinto número: ");
        n5 = input.nextInt();

        if (n1 == 0) {
            zero++;
        } else if (n1 > 0) {
            positivo++;
        } else {
            negativo++;
        }

        if (n2 == 0) {
            zero++;
        } else if (n2 > 0) {
            positivo++;
        } else {
            negativo++;
        }

        if (n3 == 0) {
            zero++;
        } else if (n3 > 0) {
            positivo++;
        } else {
            negativo++;
        }

        if (n4 == 0) {
            zero++;
        } else if (n4 > 0) {
            positivo++;
        } else {
            negativo++;
        }

        if (n5 == 0) {
            zero++;
        } else if (n5 > 0) {
            positivo++;
        } else {
            negativo++;
        }

        System.out.println(negativo + " números negativos, " +positivo + " números positivos e " +zero + " zeros foram inseridos.");
    }
}
