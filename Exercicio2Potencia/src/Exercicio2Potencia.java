import javax.swing.JOptionPane; 

public class Exercicio2Potencia {
    
    public static void main(String[] args) {
        
       
      double Base, expoente, resultado;
      
        Base = Integer.parseInt(JOptionPane.showInputDialog("Insira a Base"));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Insira o Expoente"));

       resultado = Math.pow(Base, expoente);
       
        System.out.println(resultado);
        
        
    }
    
}
