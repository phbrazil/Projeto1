
import javax.swing.JOptionPane;

public class SalarioCarreira {

    public static void main(String[] args) {
        String nome;
        double valorHora, total, quantidadeHoras, totalcompromocao = 0;
        int nivel;
        nome = JOptionPane.showInputDialog("Insira o Nome do funcionário");
        nivel = Integer.parseInt(JOptionPane.showInputDialog("Insira nível do funcionário"));
        valorHora = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da hora trabalhada"));
        quantidadeHoras = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de horas trabalhadas"));
        total = valorHora * quantidadeHoras;
        System.out.println("O funcionário " + nome + " trabalhou " + quantidadeHoras + " horas por " + valorHora + " e deve receber " + total);
        switch (nivel) {
            case 1:
                totalcompromocao = (quantidadeHoras * 15.0);
                break;
            case 2:
                totalcompromocao = (quantidadeHoras * 18.0);
                break;
            case 3:
                totalcompromocao = (quantidadeHoras * 22.0);
                break;
            case 4:
                totalcompromocao = (quantidadeHoras * 27.0);
                break;
            case 5:
                totalcompromocao = (quantidadeHoras * 33.0);
                break;
            default:
                System.out.println("Favor inserir o nível correto");
                break;
        }
        System.out.println("O funcionário " + nome + " trabalhou " + quantidadeHoras + " horas por " + valorHora + "(Nivel " + nivel + ") e deve receber " + totalcompromocao);
        if (nivel > 0 && nivel <= 5) {
            System.out.println("O funcionário " + nome + " teve promoção, trabalhou " + quantidadeHoras + " horas por " + valorHora + "(Nivel " + nivel + ") e seu novo salário é de " + totalcompromocao);
            System.out.printf("O imbecil %s  trabalhou %2f horas por %2f e deve receber %2f", nome,quantidadeHoras, valorHora, total);
        
        } else {
            System.out.println("Nível não encontrado na tabela");
        }
    }
}
