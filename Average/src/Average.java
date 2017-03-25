import javax.swing.JOptionPane; 

public class Average {

    public static void main (String [] args){

        int numero1, numero2, numero3, avg;

        numero1= Integer.parseInt(JOptionPane.showInputDialog("Please input mark for test 1: "));

        numero2= Integer.parseInt(JOptionPane.showInputDialog("Please input mark for test 2: "));

        numero3= Integer.parseInt(JOptionPane.showInputDialog("Please input mark for test 3: "));

        
     avg = (numero1 + numero2 + numero3)/3;
     
     System.out.println("A média é: "+avg);
        
    }

}