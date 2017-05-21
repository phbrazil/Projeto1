public class Ex5 {

    static double MaiorRaiz(double numeroA, double numeroB, double numeroC) {
        double resultado = 0;
        double delta = Math.sqrt((Math.pow(numeroB, 2) - (4 * (numeroA * numeroC))));

        double calculopositivo = (-numeroB + delta) / (2 * numeroA);
        double calculonegativo = (-numeroB - delta) / (2 * numeroA);

        if (calculopositivo > calculonegativo && calculopositivo >=0 ) {
            resultado = calculopositivo;
        } else if(calculonegativo >calculopositivo && calculonegativo >=0) {
            resultado = calculonegativo;
        }else{
            resultado = -1;
        }
        return resultado;

    }
    
    public static void main(String[] args) {
        
        double numeroA = 2;
        double numeroB = 2;
        double numeroC = -12;
        
        double resultado = MaiorRaiz(numeroA, numeroB, numeroC);    
        System.out.println(resultado);
        
    }

}
