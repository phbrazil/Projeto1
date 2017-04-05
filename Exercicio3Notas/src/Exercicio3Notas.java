
import javax.swing.JOptionPane;

public class Exercicio3Notas {

    public static void main(String[] args) {

        int dinheiro, nota1, nota5, nota10, nota50, nota100, resto100 = 0, resto50 = 0, resto10 = 0, resto5 = 0, resto1 = 0;

        dinheiro = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia em número"));
        System.out.println("Valor Solicitado: R$" + dinheiro);
        
        if (dinheiro / 100 >= 1) {
            nota100 = dinheiro / 100;
            resto100 = dinheiro % 100;
            System.out.println(nota100 + " Nota(s) de 100");
            
        } else if (dinheiro / 50 >= 1) {
            nota50 = dinheiro / 50;
            resto50 = dinheiro % 50;
            System.out.println(nota50 + " Nota(s) de 50");

        } else if (dinheiro / 10 >= 1) {
            nota10 = dinheiro / 10;
            resto10 = dinheiro % 10;
            System.out.println(nota10 + " Nota(s) de 10");

        } else if (dinheiro / 5 >= 1) {
            nota5 = dinheiro / 5;
            resto5 = dinheiro % 5;
            System.out.println(nota5 + " Nota(s) de 5");

        } else if (dinheiro / 1 >= 1) {
            nota1 = dinheiro / 1;
            resto1 = dinheiro % 1;
            System.out.println(nota1 + " Nota(s) de 1");
        }
        if (resto100 / 50 >= 1) {
            nota50 = resto100 / 50;
            resto50 = resto100 % 50;
            System.out.println(nota50 + " Nota(s) de 50");

        } else if (resto100 >= 1 && resto100 <= 5) {
            nota1 = resto100 / 1;
            System.out.println(nota1 + " Nota(s) de 1");
            
        } else if (resto100 > 5 && resto100 < 10) {
            nota5 = resto100 / 1;
            System.out.println(nota5 + " Nota(s) de 5");
            
        } else if (resto100 >= 10 && resto100 < 50) {
            nota10 = resto100 / 10;
            resto50 = resto100 % 10;
            System.out.println(nota10 + " Nota(s) de 10");
        }
        if (resto50 / 10 >= 1) {
            nota10 = resto50 / 10;
            resto10 = resto50 % 10;
            System.out.println(nota10 + " Nota(s) de 10");

        } else if (resto50 > 5 && resto50 < 10) {
            nota5 = resto50 / 5;
            resto50 = resto50 % 5;
            System.out.println(nota5 + " Nota(s) de 5");

        }
        if (resto50 >= 1 && resto50 <= 5) {
            nota1 = resto50 / 1;
            System.out.println(nota1 + " Nota(s) de 1");
        }
        if ((resto10 >= 5) && (resto10 < 10)) {
            nota5 = resto10 / 5;
            resto5 = resto10 % 5;
            System.out.println(nota5 + " Nota(s) de 5");
        } else if (resto10 >= 1 && resto10 <= 5) {
            nota1 = resto10 / 1;
            System.out.println(nota1 + " Nota(s) de 1");
        }
        if (resto5 >= 1 && resto5 < 5) {
            nota1 = resto5 / 1;
            System.out.println(nota1 + " Nota(s) de 1");
            if (resto10 >= 1 && resto10 <= 5) {
                nota1 = resto10 / 1;
                resto1 = resto5 % 1;
                System.out.println(nota1 + " Nota(s) de 1");
            }
        }

    }
}
