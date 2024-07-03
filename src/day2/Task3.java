package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputFirst = scanner.nextInt();
        int inputSecond = scanner.nextInt();

        int i = inputFirst+1;

        while (i<inputSecond) {
            
            if (i % 10 != 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

}
