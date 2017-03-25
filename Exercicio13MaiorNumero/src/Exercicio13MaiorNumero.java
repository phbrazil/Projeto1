
import javax.swing.JOptionPane;
public class Exercicio13MaiorNumero {
 
    
    
    public static void main(String[] args) {
   
    int numero1, numero2, numero3, maximo;
    
           
    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
    numero3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));

    
    maximo = Math.max(numero1, Math.max(numero2,numero3));
    
        System.out.println("O número máximo é : "+maximo);
        
        
    
    
    
    
    

    
        
}
}
