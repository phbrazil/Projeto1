
import javax.swing.JOptionPane;


public class Exercicio7Hipotenusa {
    public static void main(String[] args) {
        
        
        double hipotenusa, numeroA, numeroB;
        
        numeroA = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número A"));

        numeroB = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número B"));

        
        hipotenusa = Math.sqrt(Math.pow(numeroA,2) + Math.pow(numeroB,2));

        System.out.println("A hipotenusa é "+hipotenusa);
        
    }
    


}


