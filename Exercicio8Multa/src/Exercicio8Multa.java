
import javax.swing.JOptionPane;

public class Exercicio8Multa {

    public static void main(String[] args) {

        double associacao, total;

        associacao = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da Associação"));

        double janeiro = (associacao * 1.05);
        double fevereiro = (janeiro * 1.05);
        double marco = (fevereiro * 1.05);
        double abril = (marco * 1.05);
        double maio = (abril * 1.05);
        double junho = (maio * 1.05);
        double julho = (junho * 1.05);
        double agosto = (julho * 1.05);
        double setembro = (agosto * 1.05);
        double outubro = (setembro * 1.05);
        double novembro = (outubro * 1.05);
        double dezembro = (novembro * 1.05);

        total = (janeiro + fevereiro + marco + abril + maio + junho + julho + agosto + setembro + outubro + novembro + dezembro);

        System.out.printf("O total é de R$%.2f", total);

    }

}
