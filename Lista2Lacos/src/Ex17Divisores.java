
import javax.swing.JOptionPane;

public class Ex17Divisores {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        int contador = 1;

        while (contador <= numero) {

            if (numero % contador == 0) {

                System.out.println(contador+ " é um divisor de "+numero);

            }
            contador = contador + 1;

        }

    }

}
