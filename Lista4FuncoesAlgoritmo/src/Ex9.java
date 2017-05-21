
public class Ex9 {
    
    static int idade (int anos, int meses, int dias){
        
        int resultado = (anos*365)+(meses*30)+dias;
        
        
        return resultado;
        
    }
    
    public static void main(String[] args) {
        
        int anos = 27;
        int meses = 5;
        int dias = 21;
        
        int resultado = idade(anos, meses, dias);
        
        System.out.println(resultado);
        
    }
    
}
