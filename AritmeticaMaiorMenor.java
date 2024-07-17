import java.util.Scanner;

public class AritmeticaMaiorMenor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int sum;
        int product;
        int media;

        //soma, média, produto e os
        //números menores e maiores.
        System.out.print("Insira o primeiro número inteiro: ");
        num1 = input.nextInt();
        System.out.print("Insira o segundo número inteiro: ");
        num2 = input.nextInt();
        System.out.print("Insira o terceiro número inteiro: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        media = (num1 + num2 + num3)/3;
        product = num1 * num2 * num3;


        System.out.println("A soma dos valores é: "+sum);
        System.out.println("A média dos valores é: "+media);
        System.out.println("O produto dos valores é: "+product);

        if ((num1 < num2) && (num1 < num3)){
            System.out.println("O menor número é "+num1);
        }
        else if ((num2 < num1) && (num2 < num3)){
            System.out.println("O menor número é "+num2);
        }
        else if ((num3 < num1) && (num3 < num2)){
            System.out.println("O menor número é "+num3);
        }

        if ((num1 > num2) && (num1 > num3)){
            System.out.println("O maior número é "+num1);
        }
        else if ((num2 > num1) && (num2 > num3)){
            System.out.println("O maior número é "+num2);
        }
        else if ((num3 > num1) && (num3 > num2)){
            System.out.println("O maior número é "+num3);
        }
    }
}
