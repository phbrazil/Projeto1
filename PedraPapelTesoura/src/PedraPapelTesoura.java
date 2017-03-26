import java.util.Random;
import javax.swing.JOptionPane;

public class PedraPapelTesoura {

    public static void main(String[] args) {

        String jogadaUser, computador = "";
        int numero;

        jogadaUser = JOptionPane.showInputDialog("Digite Pedra, Papel, Tesoura");

        if (jogadaUser.equals("Tesoura") || jogadaUser.equals("Pedra") || jogadaUser.equals("Papel")) {

            Random maquina = new Random();
            numero = maquina.nextInt(3) + 1;

            if (numero == 1) {
                computador = "Pedra";
            } else if (numero == 2) {
                computador = "Papel";
            } else if (numero == 3) {
                computador = "Tesoura";
            }
            System.out.println("Você jogou " + jogadaUser + " e a máquina jogou " + computador);
        
           
         if(jogadaUser.equals(computador)){
             System.out.println("Empatou");
         }
         else if(jogadaUser.equals("Tesoura") && computador.equals("Pedra")){
             System.out.println("Perdeu HUEHUE");
         }    
         else if(jogadaUser.equals("Pedra") && computador.equals("Papel")){
             System.out.println("Perdeu HUEHUE");
         }    
         else if(jogadaUser.equals("Papel") && computador.equals("Tesoura")){
             System.out.println("Perdeu HUEHUE");
         }
         else{
             System.out.println("Ganhou");
             
         }  
        }
         else{
            System.out.println("Insira Pedra, Papel ou Tesoura");
         
        }    
    }
}   
