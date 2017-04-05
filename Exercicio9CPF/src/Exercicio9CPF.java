
import javax.swing.JOptionPane;

public class Exercicio9CPF {

    public static void main(String[] args) {

        long CPF;
        int digito11, digito10, digito9, digito8, digito7, digito6, digito5, digito4, digito3, digito2, digito1;

        CPF = Long.parseLong(JOptionPane.showInputDialog("Insira o CPF"));

        

        digito1 = Integer.parseInt(Long.toString(CPF).substring(0, 1));
        digito2 = Integer.parseInt(Long.toString(CPF).substring(1, 2));
        digito3 = Integer.parseInt(Long.toString(CPF).substring(2, 3));
        digito4 = Integer.parseInt(Long.toString(CPF).substring(3, 4));
        digito5 = Integer.parseInt(Long.toString(CPF).substring(4, 5));
        digito6 = Integer.parseInt(Long.toString(CPF).substring(5, 6));
        digito7 = Integer.parseInt(Long.toString(CPF).substring(6, 7));
        digito8 = Integer.parseInt(Long.toString(CPF).substring(7, 8));
        digito9 = Integer.parseInt(Long.toString(CPF).substring(8, 9));
        digito10 = Integer.parseInt(Long.toString(CPF).substring(9, 10));
        digito11= Integer.parseInt(Long.toString(CPF).substring(10, 11));

        System.out.println(digito1);
        System.out.println(digito2);
        System.out.println(digito11);

    }

}
