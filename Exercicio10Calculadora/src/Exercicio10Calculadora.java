
import javax.swing.JOptionPane;

public class Exercicio10Calculadora {

    public static void main(String[] args) {

        int numero1, numero2;
        String operador;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número"));
        operador = JOptionPane.showInputDialog("Insira o operador entre +, -, * ou /");

        switch (operador) {
            case "+":
                System.out.println("O resultado é: " + (numero1 + numero2));
                break;
            case "-":
                System.out.println("O resultado é: " + (numero1 - numero2));
                break;
            case "*":
                System.out.println("O resultado é: " + (numero1 * numero2));
                break;
            case "/":
                System.out.println("O resultado é: " + (numero1 / numero2));
                break;
            default:
                System.out.println("Operador inválido");

        }

    }
}