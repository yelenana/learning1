package day7;

public class Airplane {
    private String producer;
    private int length;

    public Airplane(String producer, int length) {
        this.producer = producer;
        this.length = length;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length) {
            System.out.println(airplane1.producer + " длиннее");
        } else if (airplane1.length < airplane2.length) {
            System.out.println(airplane2.producer + " длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }
}
