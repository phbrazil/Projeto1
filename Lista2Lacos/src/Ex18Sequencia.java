
import javax.swing.JOptionPane;

public class Ex18Sequencia {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        if (numero > 46 || numero <= 0) {
            System.out.println("Insira um número maior que 0 e menor que 46 ");
        } else {
            int contador = 0;
            int A = 0;
            int B = 1;
            System.out.println(A + "A");
            System.out.println(B + "B");

            while (contador  < numero) {

                int C = A + B;
                System.out.println(C + "C");
                if (C >= numero) {
                    contador = C;
                    break;
                }
                int D = B + C;
                System.out.println(D + "D");
                if (D >= numero) {
                    contador = D;
                    break;
                }
                A = C + D;
                System.out.println(A + "A");
                if (A >= numero) {
                    contador = A;
                    break;
                }

                B = A + D;
                System.out.println(B + "B");
                if (B >= numero) {
                    contador = B;
                    break;
                }

            }
        }

    }
}
