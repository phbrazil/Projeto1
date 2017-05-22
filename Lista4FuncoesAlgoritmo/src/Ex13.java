
public class Ex13 {

    static int Divisores(int numero) {
        int resultado = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                resultado = resultado + 1;
            }

        }
        return resultado;

    }

    public static void main(String[] args) {

        int numero = 10;

        int resultado = Divisores(numero);

        System.out.println(resultado);

    }

}
