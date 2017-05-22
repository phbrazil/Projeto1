public class Ex11 {

    static String Conceito(double media) {
        String resultado;

        if (media >= 0.0 && media <= 4.9) {
            resultado = "D";
        } else if (media >= 5.0 && media <= 6.9) {
            resultado = "C";
        } else if (media >= 7.0 && media <= 8.9) {
            resultado = "B";
        } else if (media >= 9 && media <= 10) {
            resultado = "A";
        } else {
            resultado = "Fora do Padrao";

        }
        return resultado;

    }

    public static void main(String[] args) {

        double nota = 5;
        String resultado = Conceito(nota);

        System.out.println(resultado);

    }

}
