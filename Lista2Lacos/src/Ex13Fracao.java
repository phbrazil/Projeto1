
import javax.swing.JOptionPane;

public class Ex13Fracao {

    public static void main(String[] args) {

        double resultadonumerador, total = 1, numerador, denominador, contador, resultadodenominador;
        //total = 1 para economizar no primeiro calculo
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número"));

        numerador = 1;
        denominador = numero;
        contador = 2;

        while (numerador <= numero && denominador <= (2 * numero - 1)) {

            resultadonumerador = numerador * contador;
            resultadodenominador = numerador * (contador + 1);
            contador = contador + 1;


            //System.out.println(resultadonumerador + " numerador");
            //System.out.println(resultadodenominador + " denominador");

            total = total + (resultadonumerador / resultadodenominador);
           //System.out.println("total "+numerador+": "+total);
            numerador = numerador + 1;
        }
        System.out.printf("A soma total é de: %.2f %n", total);

    }

}
