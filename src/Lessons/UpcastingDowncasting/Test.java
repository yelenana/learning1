package Lessons.UpcastingDowncasting;

public class Test {
    public static void main(String[] args) {
        //Upcasting
      Animal a = new Animal();
      Dog dog = (Dog) a;
      dog.bark();
    }
}
