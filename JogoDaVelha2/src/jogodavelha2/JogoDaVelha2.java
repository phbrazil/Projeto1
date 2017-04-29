package jogodavelha2;

import javax.swing.JOptionPane;

public class JogoDaVelha2 {

    public static void main(String[] args) {

        int dialogButton = 0; //BOTAO JOGAR NOVAMENTE OU NAO
        int dialogResult = 0; // RESULTADO DO BOTAO
        int quadradosLivres = 1; //QUANTIDADE DE JOGADAS 9

        //LACO DENTRO DE LACO PARA DAR A OPCAO DE JOGAR NOVAMENTE
        do {

            //ARRAY NO PRINT NA TELA
            String[] print = new String[9];

            String pos1 = "    ", pos2 = "    ", pos3 = "    ", pos4 = "    ", pos5 = "    ", pos6 = "    ", pos7 = "    ", pos8 = "    ", pos9 = "    ", jogada = "    ";
            String posicao; //POSICAO QUE O USER DIGITA
            String JogadaUser1 = "", JogadaUser2 = "", QuemJoga = "";

            String Jogador1;
            Jogador1 = JOptionPane.showInputDialog("Digite o Nome o Jogador 1");

            String Jogador2;
            Jogador2 = JOptionPane.showInputDialog("Digite o Nome o Jogador 2");

            if (Jogador1.equals("")) {
                JOptionPane.showMessageDialog(null, "Nome do Jogador 1 inválido");
                Jogador1 = JOptionPane.showInputDialog("Digite o Nome o Jogador 1");

            }
            if (Jogador2.equals("")) {
                JOptionPane.showMessageDialog(null, "Nome do Jogador 2 inválido");
                Jogador2 = JOptionPane.showInputDialog("Digite o Nome o Jogador 2");

            }

            String[] JogadaSelecionada = {"X", "O"}; //COMBOBOX PARA SELECIONAR 

            //VARIAVEL QUE RECEBE O RESULTADO DO COMBOBOX
            String JogadaUser = (String) JOptionPane.showInputDialog(null, "Choose your destiny...",
                    "Qual o simbolo do Jogador 1", JOptionPane.QUESTION_MESSAGE, null, JogadaSelecionada, JogadaSelecionada[0]);

            if (JogadaUser.equals("X")) {
                JogadaUser1 = "X";
                JogadaUser2 = "O";
            } else if (JogadaUser.equals("O")) {
                JogadaUser1 = "O";
                JogadaUser2 = "X";
            }

            //BOLEANAS PARA INVERTER O SIMBOLO E O JOGADOR A CADA JOGADA
            boolean vez = true;
            boolean vezSimbolo = true;

            //GRAFICO DO JOGO DA VELHA EM ARRAY
            print[0] = "   " + pos1 + "   |   " + pos2 + "   |   " + pos3 + "   ";
            print[1] = "-------|-------|------";
            print[2] = "   " + pos4 + "   |   " + pos5 + "   |   " + pos6 + "   ";
            print[3] = "-------|-------|------";
            print[4] = "   " + pos7 + "   |   " + pos8 + "   |   " + pos9 + "   ";

            JOptionPane.showMessageDialog(null, print);

            while (quadradosLivres <= 9) {

                if (vez) {
                    QuemJoga = Jogador1;
                } else {
                    QuemJoga = Jogador2;
                }

                if (vezSimbolo) {
                    jogada = JogadaUser1;
                } else {
                    jogada = JogadaUser2;
                }

                posicao = JOptionPane.showInputDialog(QuemJoga + " Digite a posicao de 1 a 9");

                //NAO USEI INT POIS NAO CONSEGUI VALIDAR COM INT CASO O USER NAO DIGITE A POSICAO
                if (posicao.equals("1") || posicao.equals("2") || posicao.equals("3")
                        || posicao.equals("4") || posicao.equals("5") || posicao.equals("6")
                        || posicao.equals("7") || posicao.equals("8") || posicao.equals("9")) {

                    boolean posicao1 = posicao.equals("1") && pos1.equals("    ");
                    boolean posicao2 = posicao.equals("2") && pos2.equals("    ");
                    boolean posicao3 = posicao.equals("3") && pos3.equals("    ");
                    boolean posicao4 = posicao.equals("4") && pos4.equals("    ");
                    boolean posicao5 = posicao.equals("5") && pos5.equals("    ");
                    boolean posicao6 = posicao.equals("6") && pos6.equals("    ");
                    boolean posicao7 = posicao.equals("7") && pos7.equals("    ");
                    boolean posicao8 = posicao.equals("8") && pos8.equals("    ");
                    boolean posicao9 = posicao.equals("9") && pos9.equals("    ");

                    //TENTEI COM SWITCH E IF MAS FICOU BUGADO
                    if (posicao1) {
                        pos1 = jogada;
                        quadradosLivres = quadradosLivres + 1;
                    } else if (posicao2) {
                        pos2 = jogada;
                        quadradosLivres = quadradosLivres + 1;
                    } else if (posicao3) {
                        pos3 = jogada;
                        quadradosLivres = quadradosLivres + 1;
                    } else if (posicao4) {
                        pos4 = jogada;
                        quadradosLivres = quadradosLivres + 1;
                    } else if (posicao5) {
                        pos5 = jogada;
                        quadradosLivres = quadradosLivres + 1;
                    } else if (posicao6) {
                        pos6 = jogada;
                        quadradosLivres = quadradosLivres + 1;
                    } else if (posicao7) {
                        pos7 = jogada;
                        quadradosLivres = quadradosLivres + 1;
                    } else if (posicao8) {
                        pos8 = jogada;
                        quadradosLivres = quadradosLivres + 1;
                    } else if (posicao9) {
                        pos9 = jogada;
                        quadradosLivres = quadradosLivres + 1;
                    } else {
                        JOptionPane.showMessageDialog(null, "Já jogaram nessa posicao ");
                        //posicao = JOptionPane.showInputDialog(QuemJoga + " Digite a posicao de 1 a 9");

                    }


                } else {
                    JOptionPane.showMessageDialog(null, "Posicao inválida");
                vez = !vez;
                vezSimbolo = !vezSimbolo;

                } 


                print[0] = "   " + pos1 + "   |   " + pos2 + "   |   " + pos3 + "   ";
                print[1] = "-------|-------|------";
                print[2] = "   " + pos4 + "   |   " + pos5 + "   |   " + pos6 + "   ";
                print[3] = "-------|-------|------";
                print[4] = "   " + pos7 + "   |   " + pos8 + "   |   " + pos9 + "   ";

                JOptionPane.showMessageDialog(null, print);

                vez = !vez;
                vezSimbolo = !vezSimbolo;

                if (quadradosLivres == 10) {
                    JOptionPane.showMessageDialog(null, "Deu VELHA");
                    break;
                }

                if (pos1.equals("X") && pos2.equals("X") && pos3.equals("X")
                        || pos4.equals("X") && pos5.equals("X") && pos6.equals("X")
                        || pos7.equals("X") && pos8.equals("X") && pos9.equals("X")
                        || pos1.equals("X") && pos5.equals("X") && pos9.equals("X")
                        || pos3.equals("X") && pos5.equals("X") && pos7.equals("X")
                        || pos1.equals("X") && pos4.equals("X") && pos7.equals("X")
                        || pos2.equals("X") && pos5.equals("X") && pos8.equals("X")
                        || pos3.equals("X") && pos6.equals("X") && pos9.equals("X")) {

                    JOptionPane.showMessageDialog(null, QuemJoga + " GANHOOOOOOU ");
                    break;
                } else if (pos1.equals("O") && pos2.equals("O") && pos3.equals("O")
                        || pos4.equals("O") && pos5.equals("O") && pos6.equals("O")
                        || pos7.equals("O") && pos8.equals("O") && pos9.equals("O")
                        || pos1.equals("O") && pos5.equals("O") && pos9.equals("O")
                        || pos3.equals("O") && pos5.equals("O") && pos7.equals("O")
                        || pos1.equals("O") && pos4.equals("O") && pos7.equals("O")
                        || pos2.equals("O") && pos5.equals("O") && pos8.equals("O")
                        || pos3.equals("O") && pos6.equals("O") && pos9.equals("O")) {
                    JOptionPane.showMessageDialog(null, QuemJoga + " GANHOOOOOOU ");
                    break;

                }

                System.out.println("Jogada " + quadradosLivres);

            }

            //BOTAO PARA JOGAR NOVAMENTE E ALTERAR O DO WHILE 
            JOptionPane.showMessageDialog(null, print);
            dialogResult = JOptionPane.showConfirmDialog(null, "Jogar novamente?", "Warning", dialogButton);
            if (dialogResult == 0) {
                quadradosLivres = 1;
                pos1 = "    ";
                pos2 = "    ";
                pos3 = "    ";
                pos4 = "    ";
                pos5 = "    ";
                pos6 = "    ";
                pos7 = "    ";
                pos8 = "    ";
                pos9 = "    ";
                vez = !vez;
                vezSimbolo = !vezSimbolo;

            } else {
                JOptionPane.showMessageDialog(null, "ARREGOOOOUUUUUUU");

            }

        } while (dialogResult == 0);

    }

}
