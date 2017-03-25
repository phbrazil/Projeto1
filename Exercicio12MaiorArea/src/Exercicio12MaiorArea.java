
import javax.swing.JOptionPane;

public class Exercicio12MaiorArea {

    public static void main(String[] args) {

        double ladoL, ladoR, quadrado, circulo;

        ladoL = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de L"));

        ladoR = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de R"));

        quadrado = ladoL * 4;

        circulo = ladoR / 2;

        if (quadrado > circulo) {
            System.out.println("O maior é o Quadrado");
        } else {
            System.out.println("O maior é o Circulo");
        }

    }

}
