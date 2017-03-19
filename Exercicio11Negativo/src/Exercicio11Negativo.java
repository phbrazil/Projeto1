import javax.swing.JOptionPane; 

public class Exercicio11Negativo {
    
    
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número"));
        
        
        if (numero <0) {
            System.out.println("Número é Negativo");
        }
                else{
                System.out.println("Número é Positivo");
            
            }    
        }

        
        
        
    }
    
    

