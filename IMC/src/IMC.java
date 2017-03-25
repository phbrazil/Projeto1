
import javax.swing.JOptionPane;

public class IMC {

    public static void main(String[] args) {

        double altura, peso, imc;
        String nome, categoria;

        nome = JOptionPane.showInputDialog("Insira o nome");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Insira a altura"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("Insira o peso"));

        imc = peso / Math.pow(altura, 2);

        if (imc <= 18.0) {

            categoria = "Abaixo do peso";
        } else if (imc >= 18.0 && imc < 25.0) {
            categoria = "Peso Normal";
        } else if (imc >= 25.0 && imc < 30.0) {
            categoria = "Acima do peso";
        } else {
            categoria = "Obesidade";
        }

        System.out.format(nome + " está com Índice de Massa Corporal %.2f%n" + "(%s" + ")", imc, categoria);

    }

}
