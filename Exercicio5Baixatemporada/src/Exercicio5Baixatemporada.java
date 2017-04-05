
import javax.swing.JOptionPane;

public class Exercicio5Baixatemporada {

    public static void main(String[] args) {

        int mes;

        mes = Integer.parseInt(JOptionPane.showInputDialog("Insira o mês"));

        switch (mes) {
            case 12:
            case 1:
            case 2:
            case 6:
            case 7:
                System.out.println("O mês " + mes + " é de alta temporada");
                break;
            default:
                System.out.println("O mês " + mes + " é de baixa temporada");
                break;
        }

    }

}


