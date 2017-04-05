
import javax.swing.JOptionPane;

public class Exercicio7PlanoSaude {

    public static void main(String[] args) {

        int idade, tipo;
        double adicional = 100.0;

        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira o dia em número"));

        if (idade <= 10) {
            tipo = 1;
        } else if (idade > 10 && idade <= 30) {
            tipo = 2;
        } else if (idade > 40 && idade <= 60) {
            tipo = 3;
        } else {
            tipo = 4;
        }

        switch (tipo) {
            case 1:
                System.out.println("O valor pago será de: " + (adicional + 80));
                break;
            case 2:
                System.out.println("O valor pago será de: " + (adicional + 50));
                break;
            case 3:
                System.out.println("O valor pago será de: " + (adicional + 95));
                break;
            case 4:
                System.out.println("O valor pago será de: " + (adicional + 130));
                break;
        }

    }
}