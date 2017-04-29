
import javax.swing.JOptionPane;

public class Ex11FracaonegativoFor {

    public static void main(String[] args) {

        int contador;

        double resultadopositivo, total = 0, resultadonegativo;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        contador = numero;

        for (contador = 1; contador <= numero; contador = contador + 1) {

            resultadonegativo = (1.0 / contador);
            total = total + resultadonegativo;
            System.out.println(contador);
            contador = contador + 1;
            if(contador>numero){
                break;
            }
            resultadopositivo = (1.0 / contador);
            total = total - resultadopositivo;
            System.out.println(contador);

        }
        System.out.printf("A soma total é de: %.2f %n", total);

    }

}
