
import java.util.Random;
import javax.swing.JOptionPane;

public class ParImpar {

    public static void main(String[] args) {

        String jogada, jogadamaquina = null;

        jogada = JOptionPane.showInputDialog("Escreva Par ou Impar?");

        if (jogada.equals("Par") || jogada.equals("Impar")){
            
            Random maquina = new Random();
            int number;
            number = maquina.nextInt(2) + 1;
            if(number == 1){
            jogadamaquina = "Impar";
            }
            else if(number ==2){
            jogadamaquina = "Par";
            }
            
           
            System.out.println("A jogada foi " + jogada + " contra " + jogadamaquina);

        }
        if(jogadamaquina.equals("Par") && jogada.equals("Par")){
            System.out.println("Empatou");
            
        }else if(jogadamaquina.equals("Par") && jogada.equals("Impar")){
            System.out.println("Ganhou HUEHUE");
        }else if(jogadamaquina.equals("Impar") && jogada.equals("Par")){
            System.out.println("Perdeu HUEHUE");
            

            
        }

    }
}
