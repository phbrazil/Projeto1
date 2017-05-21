
import javax.swing.JOptionPane;


public class Ex4 {
    
      static int fatorial (int numero){
        
        int resultado = (numero/numero);
        
        for(int i = 1;i <=numero;i++){
            
            resultado =  resultado *i;
            
        }return resultado;
    } 
      
       static int somatoria(int numero) {
        int resultado = 0;

        for (int i = 0; i <= numero; i++) {

            resultado = resultado + i;

        }
        return resultado;
    }
       
      public static void main(String[] args) {
        
         int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
         
         int resultado = fatorial(numero)/somatoria(numero);
          System.out.println(resultado);
    }
    
}
