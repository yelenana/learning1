package Lessons.Interfaces;

public class Test {
    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");

        Animal animal = new Animal(1);
        outputInfo(animal);
        info1.showInfo();

    }

    public static void outputInfo(Info info){
        info.showInfo();
        System.out.println("outputInfo");
    }
}
