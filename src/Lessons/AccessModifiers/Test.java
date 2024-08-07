package Lessons.AccessModifiers;

import Lessons.AccessModifiers.Packet1.Person;

public class Test {
    public static void main(String[] args) {
        //public, protected, default, private
        Person person = new Person();
        System.out.println(person.getName());
    }
}
