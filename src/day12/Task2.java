package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 30; ) {
            list.add(String.valueOf(i));
            i+=2;
        }
        for (int i = 300; i < 350; ) {
            list.add(String.valueOf(i));
            i+=2;
        }
        System.out.println(list);
    }
}
