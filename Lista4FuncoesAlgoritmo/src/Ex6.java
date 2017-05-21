
public class Ex6 {

    static double MaiorRaiz(double numeroA, double numeroB, double numeroC, double saida) {
        double resultado = 0;
        double delta = Math.sqrt((Math.pow(numeroB, 2) - (4 * (numeroA * numeroC))));

        double calculopositivo = (-numeroB + delta) / (2 * numeroA);
        double calculonegativo = (-numeroB - delta) / (2 * numeroA);

        boolean positivo1 = calculopositivo > calculonegativo && calculopositivo >= 0 && saida == 1;
        boolean negativo2 = calculopositivo < calculonegativo && calculopositivo >= 0 && saida == 1;
        boolean negativo1 = calculonegativo > calculopositivo && calculonegativo >= 0 && saida == 2;
        boolean positivo2 = calculonegativo < calculopositivo && calculonegativo >= 0 && saida == 2;

        if (positivo1) {
            resultado = calculopositivo;
        } else if (negativo2) {
            resultado = calculonegativo;
        } else if (negativo1) {
            resultado = calculonegativo;
        } else if (positivo2) {
            resultado = calculopositivo;
        }else{
            resultado = -1;
        }
        return resultado;

    }

    public static void main(String[] args) {

        double numeroA = 2;
        double numeroB = 2;
        double numeroC = -12;
        int saida = 2;

        double resultado = MaiorRaiz(numeroA, numeroB, numeroC, saida);
        System.out.println(resultado);

    }

}
