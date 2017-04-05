
import javax.swing.JOptionPane;


public class Exercicio17ValorAceito {
    
    
    public static void main(String[] args) {
        
        int NumeroA, NumeroB, NumeroC, NumeroD, parimpar;
        
        
        
        NumeroA = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero A"));
        NumeroB = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero B"));
        NumeroC = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero C"));
        NumeroD = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero D"));
        
        parimpar = NumeroA%2; 
        
        boolean aceito = (NumeroB > NumeroC && NumeroD > NumeroA && (NumeroC + NumeroD) > (NumeroA + NumeroB) && NumeroC > 0 && NumeroD > 0 && parimpar == 0);
        
        if(aceito){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores não aceitos");
        }
        
    }
    
}
