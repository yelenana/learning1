package codewars.minmax;

import java.util.Arrays;
import java.util.OptionalInt;

import static java.util.Collections.min;

public class Main {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println(min);
        System.out.println(max);
    }
}

class MinMax {
    public static int[] minMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : arr) {
            if(i < min) min = i;
            if(i > max) max = i;
        }
        return new int[] {min, max};
    }

}
