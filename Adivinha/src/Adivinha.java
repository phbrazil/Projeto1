
import java.util.Random;
import javax.swing.JOptionPane;

public class Adivinha {

    public static void main(String[] args) {

        int aleatorio;
        int jogadaUser;

        Random maquina = new Random();
        aleatorio = maquina.nextInt(10) + 1;

        jogadaUser = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero de 1 a 10"));

        if (jogadaUser > 10 || jogadaUser == 0) {
            System.out.println("Insira entre 1 e 10");
        } else {

            if (jogadaUser == aleatorio) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou!");

                if (jogadaUser != aleatorio) {
                    System.out.println("Você errou! Tente novamente!");

                    jogadaUser = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero de 1 a 10"));

                    if (jogadaUser == aleatorio) {
                        System.out.println("Você acertou!");
                    } else {
                        System.out.println("Você errou de novo!");

                    }

                }

            }

        }

    }

}
