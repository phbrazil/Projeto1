
import javax.swing.JOptionPane;

public class TransporteMateriais {

    public static void main(String[] args) {

        String Material;
        int temperatura;

        Material = JOptionPane.showInputDialog("Insira o tipo de Material entre A, B, C ou D");
        temperatura = Integer.parseInt(JOptionPane.showInputDialog("Insira a temperatura"));
        boolean podetransportar;

        podetransportar = Material.equals("A") && temperatura > 10 && temperatura < 17
                || Material.equals("B") && temperatura > 11 && temperatura < 16
                || Material.equals("C") && temperatura > 12 && temperatura < 15
                || Material.equals("A") && temperatura > 13 && temperatura < 14;

        if (podetransportar) {
            System.out.println("Poder transportar");

        } else {
            System.out.println("Não pode transportar");
        }
    }
}
