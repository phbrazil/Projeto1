import javax.swing.JOptionPane; 

public class Exercicio1Multiplicacao {
    
    public static void main(String[] args) {
        
        int numero1, numero2, multiplicacao;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número"));

        multiplicacao = numero1 * numero2;
        
        System.out.println("O Resultado é: "+multiplicacao);
       
        
    }
}
