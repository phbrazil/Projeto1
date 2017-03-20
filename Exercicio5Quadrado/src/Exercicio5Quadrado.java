import javax.swing.JOptionPane;


public class Exercicio5Quadrado {

        public static void main(String[] args) {
        
        int numero, perimetro;
      
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um Número"));

        
        perimetro = numero *4;
        
            System.out.println("O perímetro é de: "+perimetro);
        

        } 
}
