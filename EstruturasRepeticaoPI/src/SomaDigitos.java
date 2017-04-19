
import javax.swing.JOptionPane;

public class SomaDigitos {

    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        int digito1, digito2, digito3, resultado;

        while (numero>999){
            System.out.println("Numero muito grande, digite um numero menor que 1000");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));

        }
        
        if (numero <= 99 && numero >9) {
            digito1 = 0;
            digito2 = Integer.parseInt(Integer.toString(numero).substring(0, 1));
            digito3 = Integer.parseInt(Integer.toString(numero).substring(1, 2));

            resultado = digito1 + digito2 + digito3;
            System.out.println("O resultado é " + resultado);
        
        } else if (numero <= 9) {
            digito1 = 0;
            digito2 = 0;
            digito3 = Integer.parseInt(Integer.toString(numero).substring(0, 1));
            
            resultado = digito1 + digito2 + digito3;
            System.out.println("O resultado é " + resultado);

        }else{
            
            digito1 = Integer.parseInt(Integer.toString(numero).substring(0, 1));
            digito2 = Integer.parseInt(Integer.toString(numero).substring(1, 2));
            digito3 = Integer.parseInt(Integer.toString(numero).substring(2, 3));
            
            resultado = digito1 + digito2 + digito3;
            System.out.println("O resultado é " + resultado);

            
        }

    }
}
