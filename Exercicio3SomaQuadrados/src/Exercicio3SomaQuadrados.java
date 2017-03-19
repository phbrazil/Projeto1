import javax.swing.JOptionPane;

public class Exercicio3SomaQuadrados {
    
    
    public static void main(String[] args) {
        
       
      double numero1, numero2, resultado;
      
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a Base"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o Expoente"));

       resultado = Math.pow(numero1, 2)+Math.pow(numero2, 2);
       
        System.out.println("O resultado é: "+resultado);
        
        
    }
    
}
