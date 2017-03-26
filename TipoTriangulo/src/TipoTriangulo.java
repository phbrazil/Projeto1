
import javax.swing.JOptionPane;

public class TipoTriangulo {

    public static void main(String[] args) {

        int ladoA, ladoB, ladoC;

        ladoA = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do lado A"));

        ladoB = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do lado B"));

        ladoC = Integer.parseInt(JOptionPane.showInputDialog("Digite a medida do lado C"));
        
        
        if(ladoA == ladoB && ladoB == ladoC){
            System.out.println("As medidas "+ladoA+", "+ladoB+" e "+ladoC+" formam um triangulo Equilátero");
        }else if (ladoA == ladoB || ladoA == ladoC){
            System.out.println("As medidas "+ladoA+", "+ladoB+" e "+ladoC+" formam um triangulo Isósceles");
        }
        else if(ladoA != ladoB || ladoA != ladoC){
            System.out.println("As medidas "+ladoA+", "+ladoB+" e "+ladoC+" formam um triangulo Escaleno");
            
        }
        else{
            System.out.println("As medidas "+ladoA+", "+ladoB+" e "+ladoC+" não formam um triângulo");
        }
        
        

    }

}
