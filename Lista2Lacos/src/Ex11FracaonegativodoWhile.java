
import javax.swing.JOptionPane;

public class Ex11FracaonegativodoWhile {

    public static void main(String[] args) {

        double contador =1;

        double total =0;

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        

        do{
            total = total + (1/contador);
            contador = contador+1;
            if(contador>numero){
                break;
            }
            total = total -(1/contador);
            contador = contador+1;

            

        }while(contador <= numero);
        System.out.println(total);

    }

}
