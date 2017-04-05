
import javax.swing.JOptionPane;


public class Exercicio2Diautil {
    
    
    public static void main(String[] args) {
        
        int dia;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia em número"));

        
        switch(dia){
            case 1:
            case 7:
                System.out.println("não é dia util");   
            break;
            
            default:
                System.out.println("É dia util");
           
            
        }
                
                
        
    }
}
