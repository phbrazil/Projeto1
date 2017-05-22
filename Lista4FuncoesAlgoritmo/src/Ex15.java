
public class Ex15 {
    
    static int potencia(int X, int Z){
        
        int resultado = X;
        
        for(int i = 1; i <Z; i++){

            resultado = resultado*X;
            
            
        }return resultado;
    }
    public static void main(String[] args) {
        
        int X = 8;
        int Z = 2;
        int resultado = potencia(X,Z);
        
        System.out.println(resultado);
        
    }
    
    
}
