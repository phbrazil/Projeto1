
import javax.swing.JOptionPane;

public class Ex2InteirosUser {

    public static void main(String[] args) {

        int numero, soma = 0, contador = 0, resultado = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));

        while (contador < numero) {

            soma = (soma + 1);
            resultado = resultado + soma;

            contador = (contador + 1);
            System.out.println(resultado);

        }
        System.out.println("O resultado final é " + resultado);

    }

}
