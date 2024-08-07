package Lessons.AccessModifiers.Packet1;

public class Test1 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.getName());
        person.setName("Tim");
        System.out.println(person.getName());
    }
}
