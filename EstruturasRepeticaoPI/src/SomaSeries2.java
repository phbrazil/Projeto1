
public class SomaSeries2 {

    public static void main(String[] args) {

        double soma =1;
        double resultado=0;


        while (soma < 1000) {
        
            resultado =resultado+(1/soma);
            System.out.printf("%.2f \n",resultado);
            soma = soma+2;
            
        

        }
        System.out.printf("O Resultado final é %.2f \n", resultado);

    }

}
