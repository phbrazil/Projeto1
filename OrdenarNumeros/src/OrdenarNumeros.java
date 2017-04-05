
import javax.swing.JOptionPane;

public class OrdenarNumeros {

    public static void main(String[] args) {

        int A, B, C, AT = 0, BT = 0, CT = 0;

        A = Integer.parseInt(JOptionPane.showInputDialog("Insira numero A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Insira numero B"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Insira numero C"));

        if (C >= B || C >= A) {
            AT = C;
            if (B >= A && B < C) {
                BT = B;
                if (A >= C && A < C) {
                    CT = A;

                    System.out.println(AT);
                    System.out.println(BT);
                    System.out.println(CT);

                }
            }
        }
    } 
}