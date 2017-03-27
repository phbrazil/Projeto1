
import java.util.Random;

public class War {

    public static void main(String[] args) {

        String GanhadorExercito1, GanhadorExercito2, GanhadorExercito3;

        Random Dadovermelho = new Random();
        Random Dadoamarelo = new Random();

        //Exercito 1
        int ataque1, defesa1;
        ataque1 = Dadovermelho.nextInt(6) + 1;
        defesa1 = Dadoamarelo.nextInt(6) + 1;

        //Exercito 2
        int ataque2, defesa2;
        ataque2 = Dadovermelho.nextInt(6) + 1;
        defesa2 = Dadoamarelo.nextInt(6) + 1;

        //Exercito 3
        int ataque3, defesa3;
        ataque3 = Dadovermelho.nextInt(6) + 1;
        defesa3 = Dadoamarelo.nextInt(6) + 1;

        //BATALHA 1
        if (ataque1 > defesa1) {
            GanhadorExercito1 = "Ataque 1 Ganhou";
        } else if (ataque1 == defesa1) {
            GanhadorExercito1 = "Batalha 1 Empatou";
        } else {
            GanhadorExercito1 = "Ataque 1 Perdeu";
        }

        System.out.println("Ataque 1: " + ataque1);
        System.out.println("Defesa 1: " + defesa1);
        System.out.println(GanhadorExercito1);

        //BATALHA 2
        if (ataque2 > defesa2) {
            GanhadorExercito2 = "Ataque 2 Ganhou";
        } else if (ataque2 == defesa2) {
            GanhadorExercito2 = "Batalha 2 Empatou";
        } else {
            GanhadorExercito2 = "Ataque 2 Perdeu";
        }
        System.out.println("Ataque 2: " + ataque2);
        System.out.println("Defesa 2: " + defesa2);
        System.out.println(GanhadorExercito2);

        //BATALHA 3
        if (ataque3 > defesa3) {
            GanhadorExercito3 = "Ataque 3 Ganhou";
        } else if (ataque3 == defesa3) {
            GanhadorExercito3 = "Batalha 3 Empatou";
        } else {
            GanhadorExercito3 = "Ataque 3 Perdeu";
        }
        System.out.println("Ataque 3: " + ataque3);
        System.out.println("Defesa 3: " + defesa3);
        System.out.println(GanhadorExercito3);

        if (ataque1 > defesa1 && ataque2 > defesa2) {
            System.out.println("Ataque ganhou saporra");
        } else if (ataque2 > defesa2 && ataque3 > defesa3) {
            System.out.println("Ataque ganhou saporra");
        } else if (ataque1 == defesa1 && ataque2 == defesa2 && ataque3 == defesa3){
            System.out.println("Empatou");
            
        } else {
            System.out.println("Defesa ganhou saporra");
        }
    }
}
