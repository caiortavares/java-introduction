import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        double peso;
        double altura;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        peso = input.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = input.nextDouble();

        double imc = peso / (altura*altura);

        System.out.printf("Seu Índice de Massa Corporal equivale a: %.2f%n %n", imc);

        System.out.printf("BMI VALUES %n Underweight: less than 18.5 %n Normal: between 18.5 and 24.9 %n Overweight: between 25 and 29.9 %n Obese: 30 or greater");
    }
}
