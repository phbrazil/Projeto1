
import java.util.Random;
import javax.swing.JOptionPane;

public class Adivinha {

    public static void main(String[] args) {

        int aleatorio;
        int jogadaUser;
        int tentativa = 0;

        Random maquina = new Random();
        aleatorio = maquina.nextInt(10) + 1;

        jogadaUser = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero de 1 a 10"));

        if (jogadaUser > 10 || jogadaUser == 0) {
            System.out.println("Insira entre 1 e 10");
        } else {
            //SENDO CHATO UMA UNICA CHANCE
            if (jogadaUser == aleatorio) {
                System.out.println("Você acertou!");
            } else {
                System.out.println("Você errou!");
             //SENDO LEGAL VARIAS CHANCES    
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

        } //MOSTRANDO NUMEROS DE TENTATIVAS (1 TENTATIVA)
        while (tentativa < 1 && jogadaUser != aleatorio) {
            tentativa = tentativa + 1;

            jogadaUser = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero de 1 a 10"));

            if (jogadaUser != aleatorio) {
            System.out.println("Você errou!");

            } else {

                System.out.println("Você acertou em " + tentativa);

            }

        } //DANDO UMA MAOZINHA (1 TENTATIVA)
        int tentativamaozinha = 0;
        String dica;
        while (tentativamaozinha < 1 && jogadaUser != aleatorio) {
            tentativamaozinha = tentativamaozinha + 1;

            jogadaUser = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero de 1 a 10"));

            if (jogadaUser != aleatorio) {
            if(jogadaUser > aleatorio){
            dica = "Menor";    
            }else{
            dica = "Maior";
            }    
            System.out.println("Você errou, o número sorteado é "+dica);

            } else {

                System.out.println("Você acertou em " + tentativamaozinha);

            }

        }// O DESAFIO (10 TENTATIVAS)
        int tentativadesafio = 0;
        String dicatentativa;
        while (tentativadesafio < 10 && jogadaUser != aleatorio) {
            tentativadesafio = tentativadesafio + 1;

            jogadaUser = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero de 1 a 10"));

            if (jogadaUser != aleatorio) {
            if(jogadaUser > aleatorio){
            dicatentativa = "Menor";    
            }else{
            dicatentativa = "Maior";
            }    
            System.out.println("Você errou, o número sorteado é "+dicatentativa+" , tente novamente!");

            } else {

                System.out.println("Você acertou em " + tentativadesafio);

            }

        }
        
        

    }
    
}
    

