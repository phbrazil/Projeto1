
public class Ex10fracao {

    public static void main(String[] args) {

        int contador;
        double resultado, total = 0;

        for (contador = 1; contador <= 20; contador = contador + 1) {

            resultado = (1.0 / contador);
            total = total + resultado;

        }
        System.out.printf("A soma total é de: %.2f %n", total);

    }

}
