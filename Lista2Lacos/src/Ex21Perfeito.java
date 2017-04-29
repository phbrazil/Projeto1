
import javax.swing.JOptionPane;

public class Ex21Perfeito {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        int contador = 1;
        int resultado = 0;

        while (contador <= numero) {

            if (numero % contador == 0) {
                resultado = resultado+contador;

                System.out.println(contador);

            }
            contador = contador + 1;

        } if((resultado-numero) == numero){
            System.out.println("O número "+numero+ " é um número perfeito");
            
            
        }

    }

}
