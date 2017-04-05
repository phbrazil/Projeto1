
import javax.swing.JOptionPane;


public class Exercicio16DuracaoJogo {
    
    public static void main(String[] args) {
        
        int HoraInicial,HoraFinal, duracao;
        
        HoraInicial = Integer.parseInt(JOptionPane.showInputDialog("Insira seu Nome"));
        HoraFinal = Integer.parseInt(JOptionPane.showInputDialog("Insira seu Nome"));

        if(HoraInicial > 24 || HoraFinal > 24){
            System.out.println("Hora inválida");
        }

        else if(HoraInicial < HoraFinal){
            
            duracao = HoraFinal - HoraInicial;
            System.out.println("O jogo Durou "+duracao+" Horas");
        }else if(HoraInicial > HoraFinal){
            duracao = (HoraFinal+24)- HoraInicial;
            System.out.println("O jogo Durou "+duracao+" Horas");
        }else if (HoraInicial == HoraFinal){
            duracao = 24;
            System.out.println("O jogo Durou "+duracao+" Horas");

        }
        
        
    }
    
}
