package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("black");
        car.setYear(2000);
        car.setModel("audi");

        System.out.println("Our car: "+ car.getYear()
         + " - year, " + car.getModel() 
         + " - model, " + car.getColor() + " - color");


        Moto moto = new Moto("kawasaki","red",1982);

        System.out.println("Our moto: "+ moto.getYear()
         + " - year, " + moto.getModel() 
         + " - model, " + moto.getColor() + " - color");

        car.info();
        System.out.println(car.getYearDifference(2021));
    }

}
