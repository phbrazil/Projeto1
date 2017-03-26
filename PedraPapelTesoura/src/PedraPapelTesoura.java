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
        }
        else{
            System.out.println("Insira Pedra, Papel ou Tesoura");
        }    
    }
}   
