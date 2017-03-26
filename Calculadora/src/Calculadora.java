
import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {

        int numero1;
        int numero2;
        int resultado;
        String operador;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
        operador = JOptionPane.showInputDialog("Insira o operador(soma, subtração, multiplicação ou divisão");

        switch (operador) {
            case "soma":
                resultado = (numero1 + numero2);
                System.out.println("A soma é: " + resultado);
                break;
            case "subtração":
                resultado = (numero1 - numero2);
                System.out.println("A subtração é: " + resultado);
                break;
            case "multiplicação":
                resultado = (numero1 * numero2);
                System.out.println("A multiplicação é: " + resultado);
                break;
            case "divisão":
                resultado = (numero1 / numero2);
                System.out.println("A divisão é: " + resultado);
                break;
            default:
                System.out.println("Operador inválido");
                break;
        }

    }

}
