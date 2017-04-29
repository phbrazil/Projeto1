
public class Ex8Media13e73 {

    public static void main(String[] args) {
        int resultado = 0;
        int media,contador = 0;

        for (media = 12; media <= 73; media = media + 2) {
            contador = contador+1;
            resultado = (resultado + media);
        }

        System.out.println("A média de pares entre 13 e 73 é: " + (resultado/contador));

    }

}
