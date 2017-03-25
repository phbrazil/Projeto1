
import javax.swing.JOptionPane;

public class Exercicio14Maiordivisao {

    public static void main(String[] args) {

        int numero1, numero2, divisor;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));

        divisor = Math.max(numero1,numero2)/Math.min(numero1,numero2);

        System.out.println("A divisão do maior número pelo menor é: " + divisor);

    }
}


