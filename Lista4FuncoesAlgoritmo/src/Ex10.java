public class Ex10 {
    
    
    static String Categoria(int idade){
        String resultado;
        
        if(idade >=5 && idade <=7){
            
            resultado = "Infantil A";
        }else if(idade >=8 && idade <=10){
            
            resultado = "Infantil B";
        }else if(idade >=11 && idade <=13){
            
            resultado = "Juvenil A";
        }else if(idade >=14 && idade <=17){
            
            resultado = "Juvenil B";
        }else if(idade >=18){
            resultado = "Adulto";
        }else{
            resultado = "Bebezao";
            
        }return resultado;
        
    }
    public static void main(String[] args) {
   
        int idade = 13;
        String resultado = Categoria(idade);
        
        System.out.println(resultado);
        
}
    
}
