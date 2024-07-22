import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        int n1;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        n1 = input.nextInt();

        if (n1 % 2 == 0){
            System.out.println("O número digitado é par.");
        }
        else {
            System.out.println("O número digitado é ímpar.");
        }
    }
}
