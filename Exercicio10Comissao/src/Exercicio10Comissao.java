
import javax.swing.JOptionPane;

public class Exercicio10Comissao {
    
    public static void main(String[] args) {
   
    String nome;
    
    double salariofixo, vendasdinheiro, comissao;
    
    
     nome = JOptionPane.showInputDialog("Insira o Nome do Funcionário");
     salariofixo = Integer.parseInt(JOptionPane.showInputDialog("Insira o salário fixo em dinheiro"));
     vendasdinheiro = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de vendas em dinheiro"));
     
     
     comissao = ((15/vendasdinheiro)*100)+salariofixo;
     
        System.out.println("O valor total a receber do funcionário "+nome+" é de: R$"+comissao);
     
     

    
}




}

