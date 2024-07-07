package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i=0; i<array.length; i++)
        array[i] = random.nextInt(1000);
        int max = array[0];
        int min = array[0];
        int count0 = 0;
        int sum0 = 0;

        for (int x: array){
            if (x>max) max = x;
            if (x<min) min = x;
            if (x%10 == 0) {
                count0++;
                sum0+=x+sum0;
            }

            System.out.println("Масив: "+Arrays.toString(array));
            System.out.println("Максимальне значення: " + max);
            System.out.println("Мінімільне значення: " + min);
            System.out.println("Кількість значень, що закінчуються на 0: " + count0);
            System.out.println("Сума значень, що закінчуються на 0: " + sum0);
        }

    }
    
}
