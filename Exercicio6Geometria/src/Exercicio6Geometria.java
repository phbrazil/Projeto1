
import javax.swing.JOptionPane;

public class Exercicio6Geometria {

    public static void main(String[] args) {
        
        double numeroA, numeroB, triangulo, quadrado,raio, numeroC, trapezio, retangulo, perimetroretangulo;
      
        numeroA = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número A"));

        numeroB = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número B"));
        
        numeroC = Integer.parseInt(JOptionPane.showInputDialog("Insira o Número C"));

        triangulo = numeroA+numeroC+Math.sqrt(Math.pow(numeroA,2) + Math.pow(numeroC,2));
        
        raio = 2*3.14159*numeroC;
        
        trapezio = numeroA+numeroB*numeroC;
        
        quadrado = numeroB*4;
        
        retangulo = numeroA*numeroB;
        
        perimetroretangulo = numeroA*2+numeroB*2;
        
            System.out.println("A área do triângulo retângulo é: "+triangulo);
            
            System.out.println("A área do circulo do raio C é: "+raio);

            System.out.println("A área do trapézio é: "+trapezio);

            System.out.println("A área do quadrado é: "+quadrado);
            
            System.out.println("A área do retangulo é: "+retangulo);
            
            System.out.println("A perímetro do retangulo é: "+perimetroretangulo);

        } 
    
}
