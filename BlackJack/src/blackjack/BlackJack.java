
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BlackJack {

    public static void main(String[] args) {

        String[] Ouros = new String[10];
        String[] Copas = new String[10];
        String[] Espadas = new String[10];
        String[] Paus = new String[30];
        String Coringas = "";
        String Jogador1, JogadaUser = "";
        String Naipe;
        int rodada = 0;
        int NaipeNumeroJogador = 0, NaipeNumeroMaquina = 0;
        boolean fimJogo = true;

        Random mesa = new Random();

        int MaoMesa = 0, MaoJogador = 0, MaoMesaNumero = 0, MaoJogadorNumero = 0;

        Jogador1 = JOptionPane.showInputDialog("Digite o Nome o Jogador");

        if (Jogador1.equals("") || Jogador1.equals(" ") || Jogador1.equals("   ")) {
            JOptionPane.showMessageDialog(null, "Nome do Jogador inválido");
        }

        do {

            String[] JogadaSelecionada = {"Outra carta", "Passar", "Trucar"};

            JogadaUser = (String) JOptionPane.showInputDialog(null, "Escolha uma opcao",
                    "O que deseja fazer?", JOptionPane.QUESTION_MESSAGE, null, JogadaSelecionada, JogadaSelecionada[0]);

            if (JogadaUser.equals("Outra carta")) {
                MaoJogador = mesa.nextInt(13) + 1;
                MaoMesa = mesa.nextInt(13) + 1;

                switch (MaoJogador) {
                    case 1:
                        MaoJogadorNumero = MaoJogadorNumero + 1;
                        MaoMesaNumero = MaoMesaNumero + 1;
                        NaipeNumeroJogador = mesa.nextInt(3);
                        NaipeNumeroMaquina = mesa.nextInt(3);
                        if (NaipeNumeroJogador == 0) {
                            Naipe = "Paus";
                        } else if (NaipeNumeroJogador == 1) {
                            Naipe = "Ouros";
                        } else if (NaipeNumeroJogador == 2) {
                            Naipe = "Espadas";
                        } else {
                            Naipe = "Copas";
                        }
                        System.out.println("Você tirou um AS de Naipe " + Naipe);
                        System.out.println("Sua mão tem " + MaoJogadorNumero);

                        break;
                    case 11:
                        MaoJogadorNumero = MaoJogadorNumero + 10;
                        MaoMesaNumero = MaoMesaNumero + 10;
                        System.out.println("Você tirou um Valete");
                        System.out.println("Sua mão tem " + MaoJogadorNumero);
                        break;
                    case 12:
                        MaoJogadorNumero = MaoJogadorNumero + 10;
                        MaoMesaNumero = MaoMesaNumero + 10;
                        System.out.println("Você tirou um Rei");
                        System.out.println("Sua mão tem " + MaoJogadorNumero);
                        break;
                    case 13:
                        MaoJogadorNumero = MaoJogadorNumero + 10;
                        MaoMesaNumero = MaoMesaNumero + 10;
                        System.out.println("Você tirou um Dama");
                        System.out.println("Sua mão tem " + MaoJogadorNumero);
                        break;
                    default:
                        MaoJogadorNumero = MaoJogadorNumero + MaoJogador;
                        MaoMesaNumero = MaoMesaNumero +MaoMesa;
                        NaipeNumeroJogador = mesa.nextInt(3);
                        NaipeNumeroMaquina = mesa.nextInt(3);
                        if (NaipeNumeroJogador == 0) {
                            Naipe = "Paus";
                        } else if (NaipeNumeroJogador == 1) {
                            Naipe = "Ouros";
                        } else if (NaipeNumeroJogador == 2) {
                            Naipe = "Espadas";
                        } else {
                            Naipe = "Copas";
                        }
                        System.out.println("você tirou a carta " + MaoJogador + " de Naipe " + Naipe);
                        System.out.println("Sua mão tem " + MaoJogadorNumero);
                        break;
                }

            }
            rodada = rodada + 1;
            
            System.out.println("Rodada de número " + rodada);
            if (MaoJogadorNumero > 21) {
                System.out.println("Você Perdeu!!!");
                fimJogo = !fimJogo;
            }

        }while(fimJogo);

        int cartanumero = mesa.nextInt(10) + 1;

        /*
        Ouros[0] = String.valueOf(cartanumero);
        Ouros[1] = ("    $    ");
        Ouros[2] = ("   $$$   ");
        Ouros[3] = ("  $$$$$  ");
        Ouros[4] = (" $$$$$$$ ");
        Ouros[5] = ("  $$$$$  ");
        Ouros[6] = ("   $$$   ");
        Ouros[7] = ("    $    ");

        Paus[0] = ("                 `-:/ooo+:-`                 ");
        Paus[1] = ("               /yNMMMMMMMMMNy/               ");
        Paus[2] = ("             `hMMMMMMMMMMMMMMMh`             ");
        Paus[3] = ("           `yMMMMMMMMMMMMMMMMMs              ");
        Paus[4] = ("           -NMMMMMMMMMMMMMMMMMN`             ");
        Paus[5] = ("            -NMMMMMMMMMMMMMMMMMm`            ");
        Paus[6] = ("            `dMMMMMMMMMMMMMMMMMs             ");
        Paus[6] = ("             /MMMMMMMMMMMMMMMMN.             ");
        Paus[7] = ("              +NMMMMMMMMMMMMMm:              ");
        Paus[10] = ("          `..../dMMMMMMMMMMNh:....`          ");
        Paus[11] = ("     `-+yddmmmmdmNMMMMMMMMMNdmNNNmmds/.      ");
        Paus[12] = ("   `/hNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNy-    ");
        Paus[13] = ("  `sNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN+   ");
        Paus[14] = ("  /MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN.  ");
        Paus[15] = ("  oMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM:  ");
        Paus[16] = ("  :NMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMN.  ");
        Paus[17] = ("  `yMMMMMMMMMMMMMMMNMMMMNNMMMMMMMMMMMMMMMo   ");
        Paus[18] = ("   `sNMMMMMMMMMMNm+yMMMMm/ymMMMMMMMMMMMd+    ");
        Paus[19] = ("     -+hmNNNmmyo:``mMMMMM+ .:oydmmmmhs:`     ");
        Paus[20] = ("         ````     +MMMMMMm.      ``          ");
        Paus[21] = ("                 `NMMMMMMMh`                 ");
        Paus[22] = ("                .hMMMMMMMMMh`                ");
        Paus[23] = ("               -dMMMMMMMMMMMd:               ");
        Paus[24] = ("              +mNNNNNNNNNNNNNms`             ");
        Paus[25] = ("             `````````````````               ");

        JOptionPane.showMessageDialog(null, Paus);

        Ouros[1] = ("    $    ");
        Ouros[2] = ("   $$$   ");
        Ouros[3] = ("  $$$$$  ");
        Ouros[4] = (" $$$$$$$ ");
        Ouros[5] = ("  $$$$$  ");
        Ouros[6] = ("   $$$   ");
        Ouros[7] = ("    $    ");
         */
    }

}
