
import javax.swing.JOptionPane;

public class Ex16DoWhile {

    public static void main(String[] args) {

        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        int contador = 0;

        do {

            int numeroUser = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));

            if ((numeroUser % 2) == 0) {
                System.out.println("O número " + numeroUser + " é Par");
            }
            if (numeroUser > 0) {
                System.out.println("Número " + numeroUser + " é Positivo");
            }
            if ((numeroUser % 2) == 1) {
                System.out.println("Número " + numeroUser + " é Impar");
            }
            if (numeroUser < 0) {
                System.out.println("Numero " + numeroUser + " é -Negativo");
            }
            contador = contador + 1;

        } while (contador < quantidade);

    }

}
