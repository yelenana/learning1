package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputFirst = scanner.nextInt();
        int inputSecond = scanner.nextInt();

        for (int i = inputFirst + 1; i < inputSecond; i++) {
            if (i % 10 == 0) {
                continue;
            } else if (i % 5 == 0) {
                System.out.print(i + " ");
                System.out.print(i + " ");
            }
        }

    }
}
