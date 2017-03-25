
import java.util.Random;
import javax.swing.JOptionPane;

public class ParImpar {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Par ou Impar?"));

        if (numero <= 0 || numero > 2) {
            System.out.println("Insira entre 1 e 2");

        } else {

            Random maquina = new Random();
            int number;
            number = maquina.nextInt(2) + 1;

            System.out.println("A jogada foi " + numero + " contra " + number);

        }

    }
}
