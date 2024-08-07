package Lessons.AccessModifiers.Packet1;

public class Person {
    private String name;

    public Person() {
        setName("Bob");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
