
import javax.swing.JOptionPane;

public class Exercicio4DiasDoMes {

    public static void main(String[] args) {

        int mes, ano;
        int dias = 30;
        int bissexto;

        mes = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano"));

        if (mes <= 0 || mes > 12) {
            System.out.println("Mês inválido");
        } else if (ano <= 0) {
            System.out.println("Ano inválido");
        } else {

            bissexto = ano % 100;

            if ((bissexto % 4) == 0 && mes == 2) {
                System.out.println("O mês " + mes + " do ano de "+ano+" tem " + (dias - 1)+" dias pois é ano bissexto");

            } else {
                System.out.println("O mês " + mes + " tem " + (dias - 2)+" dias");

            }

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dias = dias + 1;
                    System.out.println("O mês " + mes + " do ano " + ano + " tem " + dias + " dias");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("O mês " + mes + " do ano " + ano + " tem " + dias + " dias");
                    break;
            }

        }

    }
}