
public class Ex14 {

    static int soma(int A, int N) {

        int resultado = 0;
        if (N <= 0) {
            resultado = -1;
        } else {
            for (int i = N; i <= (N + A); i = i + 1) {

                resultado = N + i;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {

        int A = 3;
        int N = 2;

        int resultado = soma(A, N);
        System.out.println(resultado);

    }

}
