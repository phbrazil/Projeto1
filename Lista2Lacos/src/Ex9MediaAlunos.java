
import javax.swing.JOptionPane;

public class Ex9MediaAlunos {

    public static void main(String[] args) {

        int alunos = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de alunos"));
        int quantidade = 0;
        int nota, somanota = 0;

        while (quantidade < alunos) {

            nota = Integer.parseInt(JOptionPane.showInputDialog("Insira a nota do aluno " + (quantidade+1)));

            somanota = (somanota + nota);

            quantidade = quantidade + 1;

        }System.out.println("A media da sala é: " + (somanota / quantidade));


    }

}
