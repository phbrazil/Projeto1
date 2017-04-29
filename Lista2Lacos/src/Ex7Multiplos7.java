
public class Ex7Multiplos7 {

    public static void main(String[] args) {

        int contador = 0;

        while (contador < 200) {
            int resto = (contador%7);
            if (resto == 0) {

                int numero = contador;
                System.out.println(numero+" é multiplo de 7");

            }
            contador = contador + 1;

        }

    }

}


