import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        int n1;
        int n2;


        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        n1 = input.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        n2 = input.nextInt();

        int div = n1 / n2;

        if (n1 % n2 == 0){
            System.out.println("O primeiro número é múltiplo do segundo número.");
            System.out.println(n1 + " / " + n2 + " = " + div);
        }
        else {
            System.out.println("O primeiro número não é múltiplo do segundo número.");
        }
    }
}
