
import javax.swing.JOptionPane;

public class Exercicio1Divisivel3 {

    public static void main(String[] args) {

        int numero, resultado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));

        resultado = numero % 3;

        switch (resultado) {
            case 0:
                System.out.println("Divisível por 3");
                break;
            case 1:
                System.out.println("Número não divisivel por 3");
                break;
            default:
                System.out.println("Número não divisivel por 3, primo");
        }    

    }

}
