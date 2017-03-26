import javax.swing.JOptionPane;

public class Exercicio9Funcionario {

    public static void main(String[] args) {

        double numerofunc, horastrab, valorhora, salario;

        numerofunc = Double.parseDouble(JOptionPane.showInputDialog("Insira o numero do Funcionário"));
        horastrab = Double.parseDouble(JOptionPane.showInputDialog("Insira as horas trabalhadas"));
        valorhora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor por hora"));

        salario = horastrab * valorhora;

        System.out.println("O funcionário de número: " + numerofunc + " Receberá R$" + salario);

    }

}
