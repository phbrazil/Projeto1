import javax.swing.JOptionPane; 

public class MediaFinal5Semestre {

    public static void main (String [] args){
        
    int p1, p2,p3,p4;
    
    p1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a Nota 1"));
    p2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a Nota 2"));
    p3 = Integer.parseInt(JOptionPane.showInputDialog("Insira a Nota 3"));
    p4 = Integer.parseInt(JOptionPane.showInputDialog("Insira a Nota 4"));
    
    
        System.out.println((p1+p2+p3+p4)/4);  
    
    }
    
}