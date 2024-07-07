package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимую размерность массива");

        int massLength = scanner.nextInt;
        int[] randMassive= new int[massLength];
        Random random = new Random();
        for (int i=0; i<=massLength; i++){
            randMassive[i]=random.nextInt(10);
        }

        System.out.println(Arrays.toString(randMassive));            
        
    }
}
