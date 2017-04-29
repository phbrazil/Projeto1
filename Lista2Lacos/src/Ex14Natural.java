
import javax.swing.JOptionPane;

public class Ex14Natural {

    public static void main(String[] args) {

        double numero, resultado = 1, numerador = 0, denominador = 1;

        numero = Double.parseDouble(JOptionPane.showInputDialog("Insira um número"));

        while (numerador <= 2 * numero && denominador <= (2 * numero + 1)) {

            numerador = numerador + 2;
            denominador = denominador + 2;
            resultado = resultado + (numerador / denominador);

            //System.out.println("numerador "+numerador);
            //System.out.println("denominador "+denominador);
            //System.out.println("resultado "+resultado);
        }
        System.out.printf("A soma total é de: %.2f %n", resultado);

    }
}
