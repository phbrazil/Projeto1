
import javax.swing.JOptionPane;

public class Exercicio15Bhaskara {

    public static void main(String[] args) {

        double numeroA, numeroB, numeroC, delta, calculopositivo, calculonegativo;

        numeroA = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero A"));
        numeroB = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero B"));
        numeroC = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero C"));

        delta = Math.sqrt((Math.pow(numeroB, 2) - (4 * (numeroA * numeroC))));

            calculopositivo = (-numeroB + delta) / (2 * numeroA);
            calculonegativo = (-numeroB - delta) / (2 * numeroA);

            System.out.println("O valor de X1 é: " + calculopositivo);
            System.out.println("O valor de X2 é: " + calculonegativo);
            
        if (delta > 0) {
            System.out.println("Existem duas raízes diferentes");
        } else if (delta == 0) {
            System.out.println("Existem duas raízes iguais");
        } else{
            System.out.println("Não existe raiz real");
        }    
        }

    }


