import javax.swing.JOptionPane; 
public class HipotenusaPerimetro {
    
    
public static void main(String[] args) {
   
 double catetoA, catetoB, hipotenusaTotal, hipotenusa;
 
 catetoA = Double.parseDouble(JOptionPane.showInputDialog("Insira o Cateto A"));
 catetoB = Double.parseDouble(JOptionPane.showInputDialog("Insira o Cateto B"));
 
 hipotenusaTotal = Math.pow(catetoA,2)+ Math.pow(catetoB,2);
 
 hipotenusa = Math.sqrt(hipotenusaTotal);
 
 
 
    System.out.println("O Perimetro do triângulo é: "+(catetoA+catetoB+hipotenusa));
 
 
 
    
    
}
    
    
    
}
