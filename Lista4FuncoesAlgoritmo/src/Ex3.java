
public class Ex3 {
    
    static int fatorial (int numero){
        
        int resultado = (numero/numero);
        
        for(int i = 1;i <=numero;i++){
            
            resultado =  resultado *i;
            
        }return resultado;
    }   
        
    public static void main(String[] args) {
        
        int numero = 5;
        
        int resultado = fatorial(numero);
        
            System.out.println(resultado);
        
    }
    
}
