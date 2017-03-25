
import javax.swing.JOptionPane;

public class ContaTelefonica {

    public static void main(String[] args) {

        double assinatura = 23.32;

        double ligacoesLocais = 0.09;
        double MLocais;
        double LocaisTotal;

        double ligacoesInterurbanas = 0.26;
        double MInterUrb;
        double InterUrbTotal;

        double ligacoesInternacionais = 0.86;
        double MInternac;
        double InternacTotal;

        double total;

        MLocais = Double.parseDouble(JOptionPane.showInputDialog("Insira os minutos Locais"));
        MInterUrb = Double.parseDouble(JOptionPane.showInputDialog("Insira os minutos Interurbanos"));
        MInternac = Double.parseDouble(JOptionPane.showInputDialog("Insira os minutos Internacionais"));

        LocaisTotal = MLocais * ligacoesLocais;
        InterUrbTotal = MInterUrb * ligacoesInterurbanas;
        InternacTotal = MInternac * ligacoesInternacionais;

        total = InternacTotal + InterUrbTotal + LocaisTotal + assinatura;

        System.out.println("Ligações Locais: " + LocaisTotal);
        System.out.println("Ligações Interurbanas: " + InterUrbTotal);
        System.out.println("Ligações Internacionais: " + InternacTotal);
        System.out.println("Total da Conta: R$" + total);

    }

}
