import java.util.Scanner;

public class DadosCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Digite o raio do círulo (número inteiro): ");
        number = input.nextInt();

        int diametro = 2 * number;
        double circunferencia = 2 * Math.PI * number;
        double area = Math.PI * (number * number);

        System.out.printf("O diâmetro do círculo é: %d%n", diametro);
        System.out.printf("A circunferência do círculo é: %.2f%n", circunferencia);
        System.out.printf("A área do círculo é: %.2f%n", area);
    }
}
