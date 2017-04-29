
import javax.swing.JOptionPane;

public class Ex20CaixaEletronico {

    public static void main(String[] args) {

        double saldo;
        int operacao;

        saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo da sua conta"));

        do {

            operacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da operacao"));
            if (operacao == 1 || operacao == 2 || operacao == 3) {
                System.out.println("Operacao " + operacao + " Selecionada");
                if (operacao == 1) {
                    double deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito"));
                    saldo = saldo + deposito;
                } else if (operacao == 2) {
                    double saque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque"));
                    saldo = saldo - saque;
                }

            } else {
                System.out.println("Operacao invalida: digite 1 para Deposito, 2 para Saque ou 3 para Sair");
            }

        } while (operacao != 3);
        if (saldo == 0) {
            System.out.println("CONTA ZERADA. Seu saldo é de: " + saldo);
        } else if (saldo < 0) {
            System.out.println("CONTA ESTOURADA. Seu saldo é de: " + saldo);

        } else {
            System.out.println("CONTA PREFERENCIAL. Seu saldo é de: " + saldo);

        }
    }
}
