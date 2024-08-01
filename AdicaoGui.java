import java.util.Scanner;
import javax.swing.JOptionPane;

public class AdicaoGui {

 public static void main(String[] args)
 {
        String n1 = JOptionPane.showInputDialog("Digite o primeiro número inteiro");
        String n2 = JOptionPane.showInputDialog("Digite o segundo número inteiro");
        int soma = Integer.parseInt(n1) + Integer.parseInt(n2);

        String message = String.format("A soma dos valores é %d", soma);
        JOptionPane.showMessageDialog(null, message);

        }
}
