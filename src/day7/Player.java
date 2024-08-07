package day7;

import java.util.Random;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {

        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;

    }

    public void run(){
        if (stamina == 0) return;
        stamina--;
        if(stamina==0){
            countPlayers--;
        }
    }

    public static void info(){
        if (countPlayers < 6) {
            System.out.println("Команды не полные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
