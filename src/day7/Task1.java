package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000);
        Airplane airplane2 = new Airplane("Airbus", 2000);
        Airplane.compareAirplanes(airplane, airplane2);
    }
}
