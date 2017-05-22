
public class Ex12 {
    
    static double PesoIdeal(double altura, String Sexo){
        double resultado = 0;
        if(Sexo.equals("Masculino")|| Sexo.equals("masculino")){
            
        resultado = 72.7*altura-58;    
        }else if(Sexo.equals("Feminino")|| Sexo.equals("feminino")){
            
            resultado = 62.1*altura -44.7;
        }else{
            resultado = 0;
        }
        
        return resultado;
    }
    public static void main(String[] args) {
        
        double altura = 1.80;
        String sexo = "Masculino";
        
        double resultado = PesoIdeal(altura, sexo);
        System.out.println(resultado);
        
        
    }
}
