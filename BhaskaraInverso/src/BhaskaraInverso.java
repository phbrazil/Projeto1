
import javax.swing.JOptionPane;

public class BhaskaraInverso {

    public static void main(String[] args) {

        double X1, X2, C, S, P, A, B;

        X1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o X1"));
        X2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o X2"));
        C = Double.parseDouble(JOptionPane.showInputDialog("Insira o C"));

        S = X1 + X2;
        P = X1 * X2;
        A = C / P;
        B = -(S * A);

        System.out.println("A equação que tem raízes " + X1 + " E " + X2 + " é " + A + "X² +" + B + "X " + C+" = 0");

    }

}
