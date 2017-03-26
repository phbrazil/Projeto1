
import javax.swing.JOptionPane;

public class JogoDaVelha {

    public static void main(String[] args) {

        String pos1 = " ", pos2 = " ", pos3 = " ", pos4 = " ", pos5 = " ", pos6 = " ", pos7 = " ", pos8 = " ", pos9 = " ", jogada = " ";
        int posicao;

        jogada = JOptionPane.showInputDialog("X ou O?");
        posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posicao de 1 a 9"));

        if (posicao <= 0 || posicao > 9) {
            System.out.println("Posicao inválida");
        } else {

            if (jogada.equals("X") || jogada.equals("O")) {

                switch (posicao) {
                    case 1:
                        pos1 = jogada;
                        break;
                    case 2:
                        pos2 = jogada;
                        break;
                    case 3:
                        pos3 = jogada;
                        break;
                    case 4:
                        pos4 = jogada;
                        break;
                    case 5:
                        pos5 = jogada;
                        break;
                    case 6:
                        pos6 = jogada;
                        break;
                    case 7:
                        pos7 = jogada;
                        break;
                    case 8:
                        pos8 = jogada;
                        break;
                    case 9:
                        pos9 = jogada;
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Insira entre X ou O");
            }

            System.out.println(" " + pos1 + "  |  " + pos2 + "  | " + pos3 + "  ");
            System.out.println("____|_____|____");
            System.out.println("    |     |    ");
            System.out.println(" " + pos4 + "  |  " + pos5 + "  | " + pos6 + "  ");
            System.out.println("____|_____|____");
            System.out.println("    |     |    ");
            System.out.println(" " + pos7 + "  |  " + pos8 + "  | " + pos9 + "  ");

        }

    }

}
