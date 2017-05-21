
public class Ex8 {
    
    static boolean primo(int numero){
        
        boolean primo = false;
        
        for(int i = 1;i <=numero;i++){
            
            if(numero%i !=0){
                primo = !primo;
                
            }
            
        }return primo;
        
        
        
    }
    public static void main(String[] args) {
        
        int primo = 11;
        
        boolean resultado = primo(primo);
        System.out.println(resultado);
        
        
    }
}
