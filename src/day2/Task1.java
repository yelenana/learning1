package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите количество этажей");
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        String text;

        if (input>0 && input<=4){
           text = "Малоэтажный дом";
        } else if (input>4 && input<=8) {
            text = "Среднеэтажный дом";
        } else if (input > 9){
            text = "Многоэтажный дом";
        }else{text = "Некорректный ввод";}

        System.out.println(text);
    }

}
