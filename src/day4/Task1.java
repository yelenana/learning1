package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите необходимую размерность массива");

        int massLength = scanner.nextInt();
        int[] randMassive= new int[massLength];
        int count1 = 0; 
        int numberOfEven=0;
        int sumOfAll = 0;
        Random random = new Random();


        for (int i=0; i<massLength; i++){
            randMassive[i]=random.nextInt(10);
            if (randMassive[i] == 1) count1++;
            if (randMassive[i]%2 == 0) numberOfEven++;
            sumOfAll+=randMassive[i];
        }

        System.out.println(Arrays.toString(randMassive)); 
        System.out.println("Massive length"+massLength); 
        System.out.println("Number of 1: " + count1);  
        System.out.println("Number of Even: " + numberOfEven);
        System.out.println("Number of Odd: " + (massLength-numberOfEven));         
        
    }
}
