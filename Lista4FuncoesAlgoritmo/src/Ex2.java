
public class Ex2 {

    static int somatoria(int numero) {
        int resultado = 0;

        for (int i = 0; i <= numero; i++) {

            resultado = resultado + i;

        }
        return resultado;
    }
    public static void main(String[] args) {
        
      int a = 3;
      
      int resultado = somatoria(a);
        System.out.println(resultado);
        
        
    }

}

