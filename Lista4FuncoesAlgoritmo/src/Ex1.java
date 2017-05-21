
public class Ex1 {
    
    static int maiornumero(int a, int b, int c){
        int maior;
        if(a >= b && a >= c){
            maior = a;
            
        }else if(b >= c && b >= a){
            
            maior = b;
            
        }else{
            
            maior = c;
        }
        return maior;
    }
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 2;
        int c = 3;
        
        int maior = maiornumero(a, b, c);
        
        System.out.println(maior);
        
    }
    
}
