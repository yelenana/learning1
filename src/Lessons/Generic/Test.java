package Lessons.Generic;

import java.util.ArrayList;
import java.util.List;

import Lessons.Interfaces.Animal;

public class Test {
    public static void main(String[] args) {
        //////Java5
        List animals = new ArrayList();
        Animal ourAnimal = new Animal(1);
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(0);
        System.out.println(animal);

        //////Generic appears in Java5
        List<String> animals2 = new ArrayList<String>();
        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");
        String animal2 = animals2.get(0);
        System.out.println(animal2);

        //////Generic appears in Java7
        List<String> animals3 = new ArrayList<>();
    }
}
