package day12;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("BMW");
        list.add("Mercedes");
        list.add("Toyota");
        list.add("Honda");

        System.out.println(list);
        list.add(2, "Tesla");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
