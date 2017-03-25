
import javax.swing.JOptionPane;

public class Exercicio8Media {
    
    
    
    public static void main(String[] args) {
   
        
        int numero1,numero2,numero3,numero4, media;
        
         numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero 1"));
         numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero 2"));
         numero3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero 3"));
         numero4 = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero 4"));

         
         media = (numero1+numero2+numero3+numero4)/4;
         
         System.out.println("A média é de: "+media);
         
         
}
    
}
