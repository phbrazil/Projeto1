package jogodavelha;

import javax.swing.JOptionPane;

public class JogoDaVelha {

    public static void main(String[] args) {

        int dialogButton = 0;
        int dialogResult = 0;
        int quadradosLivres = 1;
        String[] print = new String[9];

        String pos1 = "    ", pos2 = "    ", pos3 = "    ", pos4 = "    ", pos5 = "    ", pos6 = "    ", pos7 = "    ", pos8 = "    ", pos9 = "    ", jogada = "    ";
        String posicao;
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

        String[] JogadaSelecionada = {"X", "O"};
        String JogadaUser = (String) JOptionPane.showInputDialog(null, "Choose your destiny...",
                "Qual o simbolo do Jogador 1", JOptionPane.QUESTION_MESSAGE, null, JogadaSelecionada, JogadaSelecionada[0]);

        if (JogadaUser.equals("X")) {
            JogadaUser1 = "X";
            JogadaUser2 = "O";
        } else if (JogadaUser.equals("O")) {
            JogadaUser1 = "O";
            JogadaUser2 = "X";
        }

        boolean vez = true;
        boolean vezSimbolo = true;

        print[0] = "   " + pos1 + "   |   " + pos2 + "   |   " + pos3 + "   ";
        print[1] = "-------|-------|------";
        print[2] = "   " + pos4 + "   |   " + pos5 + "   |   " + pos6 + "   ";
        print[3] = "-------|-------|------";
        print[4] = "   " + pos7 + "   |   " + pos8 + "   |   " + pos9 + "   ";

        JOptionPane.showMessageDialog(null, print);

        do {

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

                if (posicao.equals("1") || posicao.equals("2") || posicao.equals("3")
                        || posicao.equals("4") || posicao.equals("5") || posicao.equals("6")
                        || posicao.equals("7") || posicao.equals("8") || posicao.equals("9")) {

                    switch (posicao) {
                        case "1":
                            if (pos1.equals("    ")) {
                                pos1 = jogada;
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Já jogaram nesse buraco");
                                posicao = JOptionPane.showInputDialog(QuemJoga + " Digite a posicao de 1 a 9");
                            }
                        case "2":
                            if (pos2.equals("    ")) {
                                pos2 = jogada;
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Já jogaram nesse buraco");
                                posicao = JOptionPane.showInputDialog(QuemJoga + " Digite a posicao de 1 a 9");
                            }
                        case "3":
                            if (pos3.equals("    ")) {
                                pos3 = jogada;
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Já jogaram nesse buraco");
                                posicao = JOptionPane.showInputDialog(QuemJoga + " Digite a posicao de 1 a 9");
                            }
                        case "4":
                            if (pos4.equals("    ")) {
                                pos4 = jogada;
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Já jogaram nesse buraco");
                                posicao = JOptionPane.showInputDialog(QuemJoga + " Digite a posicao de 1 a 9");
                            }
                        case "5":
                            if (pos5.equals("    ")) {
                                pos5 = jogada;
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Já jogaram nesse buraco");
                                posicao = JOptionPane.showInputDialog(QuemJoga + " Digite a posicao de 1 a 9");
                            }
                        case "6":
                            if (pos6.equals("    ")) {
                                pos6 = jogada;
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Já jogaram nesse buraco");
                                posicao = JOptionPane.showInputDialog(QuemJoga + " Digite a posicao de 1 a 9");
                            }
                        case "7":
                            if (pos7.equals("    ")) {
                                pos7 = jogada;
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Já jogaram nesse buraco");
                                posicao = JOptionPane.showInputDialog(QuemJoga + " Digite a posicao de 1 a 9");
                            }
                        case "8":
                            if (pos8.equals("    ")) {
                                pos8 = jogada;
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Já jogaram nesse buraco");
                                posicao = JOptionPane.showInputDialog(QuemJoga + " Digite a posicao de 1 a 9");
                            }
                        case "9":
                            if (pos9.equals("    ")) {
                                pos9 = jogada;
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Já jogaram nesse buraco");
                                posicao = JOptionPane.showInputDialog(QuemJoga + " Digite a posicao de 1 a 9");
                            }
                            break;
                    }
                    quadradosLivres = quadradosLivres + 1;

                } else {
                    JOptionPane.showMessageDialog(null, "Posicao inválida");
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
                vezSimbolo = !vezSimbolo;

            } else {
                JOptionPane.showMessageDialog(null, "ARREGOOOOUUUUUUU");

            }

        } while (dialogResult == 0);

    }

}
