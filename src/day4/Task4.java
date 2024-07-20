package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
public static void main(String[] args) {
        
    int[] array = new int[100];
    Random random = new Random();
    int sum3 = 0;
    int min;
    int max = 0;

    for (int i=0; i<array.length; i++) {
        array[i] = random.nextInt(1000);      
    }
    System.out.print(Arrays.toString(array));

    min = array[0]+array[2]+array[3];

    for (int i=0; i<array.length-2; i++){
        sum3 =array[i]+array[i+1]+array[i+2];
        System.out.println(sum3);
        
        if (max<sum3) max=sum3;
        if (min>sum3) min=sum3;
    }
    System.out.println("Min = "+min+", Max = "+ max);
}
}
