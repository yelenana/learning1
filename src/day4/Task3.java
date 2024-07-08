package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int row = 12;
        int col = 3;
        int rowSum;
        int maxRow=0;
        int bigRow = 0;
        int [][] array = new int [row][col];
        

        for (int i=0; i<row; i++)
        { rowSum = 0;
            for (int j=0; j<col; j++)
            { 
            array[i][j] = random.nextInt(50);
            rowSum+=array[i][j];
            }
            System.out.println(Arrays.toString(array[i]));
            System.out.println(rowSum);
            if (maxRow<= rowSum) {
                maxRow = rowSum; 
                bigRow = i;
            }
    }

    System.out.println("Найбільша сума: " + maxRow);
    System.out.println("Строка: " + bigRow);


    
        
        
    }
}
