
import javax.swing.JOptionPane;

public class Ex19SenhaIncorreta {

    public static void main(String[] args) {

        String senhaUser, senha = "2002";

        senhaUser = JOptionPane.showInputDialog("Digite sua senha");

        while (!senhaUser.equals(senha)) {

            System.out.println("Senha inválida");
            
        senhaUser = JOptionPane.showInputDialog("Digite sua senha");
    

        }

        System.out.println("Acesso permitido");

    }

}
