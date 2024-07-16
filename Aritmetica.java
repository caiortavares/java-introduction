import java.util.Scanner;

public class Aritmetica {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int sum;
        int product;
        int difference;
        int div;

        System.out.print("Insira o primeiro número inteiro: ");
        num1 = input.nextInt();
        System.out.print("Insira o segundo número inteiro: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        difference = num2 - num1;
        div = num1 / num2;

        System.out.println("A soma dos valores é: "+sum);
        System.out.println("O produto dos valores é: "+product);
        System.out.println("A diferença dos valores é: "+difference);
        System.out.println("A divisão dos valores é: "+div);


    }
}
