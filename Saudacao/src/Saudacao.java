
import javax.swing.JOptionPane;

public class Saudacao {

    public static void main(String[] args) {

        String nome;

        nome = JOptionPane.showInputDialog("Insira seu Nome");

        if (nome.equals("")) {
            System.out.println("Olá, Mundo!");

        } else {
            System.out.println(nome);
        }

    }

}
