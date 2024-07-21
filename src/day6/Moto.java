package day6;

public class Moto {
    private int year;
    private String color;
    private String model;

    Moto (String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public void info(){
        System.out.println("Це мотоцикл");
    }

    public int getYearDifference(int inputYear){
        return Math.abs(inputYear - year);
    }


}
