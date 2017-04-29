
import javax.swing.JOptionPane;

public class Ex3MaiorNumero {

    public static void main(String[] args) {

        int numero = 0;

        for (int controlador = 1; controlador < 10; controlador = controlador + 1) {

            int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero mais " + (10 - controlador) + " vezes"));

            if (x > numero) {

                numero = x;

            }

        }
        System.out.println("O maior número é " + numero);

    }
}
