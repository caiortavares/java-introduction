import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int result;

        System.out.print("Digite o primeiro número: ");
        x = input.nextInt();
        System.out.print("Digite o segundo número: ");
        y = input.nextInt();
        System.out.print("Digite o terceiro número: ");
        z = input.nextInt();

        result = x + y + z;
        System.out.println("Produto é: " +result);
    }
}
