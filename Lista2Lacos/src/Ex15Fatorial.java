
import javax.swing.JOptionPane;

public class Ex15Fatorial {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int fatorial = 0;

        int contador = 0;

        //NAO ENTENDI A LOGICA DO EXERCICIO PARA CHEGAR ATÉ O VALOR 1
        
        while (fatorial <= 1) {

            fatorial = fatorial * (numero - contador);

            contador = contador + 1;
            System.out.println(fatorial);

        }

    }
}
