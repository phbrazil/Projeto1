package exercicio18triangulo;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class Exercicio18Triangulo {

    public static void main(String[] args) {
        int[] array = new int[3];
        for(int i=0;i<3;i++){
             array[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira os números"));

        }
        
        Arrays.sort(array);

        for(int i: array)
            System.out.println("antes: "+i);
        
        int a = array[2];
        int b = array[1];
        int c = array[0];
        System.out.println("depois "+a);
        System.out.println("depois "+b);
        System.out.println("depois "+c);
        

        }
    
    }