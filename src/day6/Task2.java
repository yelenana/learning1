package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 2000, 150, 10000);
        Airplane airplane2 = new Airplane("Airbus", 2005, 200, 15000);
        airplane.info();
        airplane.fillUp(100);
        airplane.fillUp(200);
        airplane.info();

        airplane2.info();
        airplane2.fillUp(300);
        airplane2.info();
        airplane2.fillUp(-100);
        airplane2.info();

    }
}
