import javax.swing.JOptionPane; 

public class MediaConsumo {
    
    public static void main(String[] args) {
   
    int distancia, litros,consumo;    
        
    
    distancia = Integer.parseInt(JOptionPane.showInputDialog("Insira distancia percorrida"));    
    litros = Integer.parseInt(JOptionPane.showInputDialog("Insira o que foi gasto em litros"));  


    consumo = distancia/litros;
    
        System.out.println("A média de consumo é de: "+consumo);
    
        
}
    
    
    
}
