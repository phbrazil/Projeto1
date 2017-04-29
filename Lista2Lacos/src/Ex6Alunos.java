
import javax.swing.JOptionPane;

public class Ex6Alunos {

    public static void main(String[] args) {

        int validador = 1;
        String nomem = "";
        int idadem = 0;
        String sexom = "";

        do {

            String nome = JOptionPane.showInputDialog("Digite o nome o aluno " + validador);

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno " + validador));

            String sexo = JOptionPane.showInputDialog("Digite o sexo do aluno " + validador + " entre M e F");

            validador = validador + 1;

            if (idade > idadem) {
                idadem = idade;
                nomem = nome;
                sexom = sexo;

            }

        } while (validador < 6);

        System.out.println("O Aluno " + nomem + " do sexo " + sexom + " tem a maior idade de " + idadem + " anos de idade");

    }

}
