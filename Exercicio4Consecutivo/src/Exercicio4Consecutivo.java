import javax.swing.JOptionPane;
public class Exercicio4Consecutivo {
    
    
    public static void main(String[] args) {
   
        
        int numero1, numero2, resultado1,resultado2;
      
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número 2"));
        
        resultado1 = numero1+1;
        resultado2 = numero2+1;
        
        System.out.println(resultado1);
        System.out.println(resultado2);
}
    
}


