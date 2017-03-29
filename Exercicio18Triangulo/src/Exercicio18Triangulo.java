
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Exercicio18Triangulo {

    public static void main(String[] args) {

    int[] array = new int[3];
        for(int i=0;i<3;i++){
             array[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira os 3 números"));

        }
        
        Arrays.sort(array);

        
        double A = array[2];
        double B = array[1];
        double C = array[0];        

  
        if (A >= (B + C)) {
            System.out.println("Não forma triângulo");
        }
        if ((A * A) == ((B * B) + (C * C))) {
            System.out.println("Triângulo retangulo");
        }
        if ((A * A) > ((B * B) + (C * C))) {
            System.out.println("Triângulo obtusangulo");
        }
        if ((A * A) < ((B * B) + (C * C))) {
            System.out.println("Triângulo acutangulo");
        }
        if ((A * A) == (B * B) && (B * B) == (C * C)) {
            System.out.println("Triangulo equilatero");
        }
        if (A == B && B != C || B == C && C != A || A == C && C != B) {
            System.out.println("Trianglo isosceles");
        }
    }

}

