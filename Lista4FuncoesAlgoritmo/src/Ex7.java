
public class Ex7 {
    
    static double volume(double raio){
        
        double volume;
        double pi = 3.14159265359;
        
        volume = (4/3)*pi*Math.pow(raio, 3);
        return volume;
    
    }
    
    public static void main(String[] args) {
        
        double raio = 3;
        double resultado = volume(raio);
        
        System.out.println(resultado);
        
    }
    
}
