
import javax.swing.JOptionPane;

public class Ex12Fracao {

    public static void main(String[] args) {

        double resultado = 0, total = 0, numerador, denominador;

        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

        numerador = numero;
        denominador = numero;

        //for (contador = 1; contador <= numero; contador = contador + 1) {
        while ((numerador - 1) > 1 && (denominador - 1) > 1) {

            resultado = (numerador / denominador);
            total = total + resultado;
            numerador = numerador + 1;
            denominador = denominador - 1;

        }
        System.out.printf("A soma total é de: %.2f %n", total);

    }

}
