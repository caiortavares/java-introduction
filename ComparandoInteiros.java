import java.sql.SQLOutput;
import java.util.Scanner;

public class ComparandoInteiros {
    public static void main(String[] args){
        int n1;
        int n2;

        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        n1 = input.nextInt();
        System.out.print("Digite o primeiro número inteiro: ");
        n2 = input.nextInt();

        if (n1 > n2){
            System.out.println(+n1 + " é maior que " +n2);
        }
        else if (n2 > n1){
            System.out.println(+n2 + " é maior que " +n1);
        }
        else {
            System.out.println("Estes números são iguais");
        }
    }
}
