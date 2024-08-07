package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Red"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedAria(figures));
        System.out.println(calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figure){
        double sum = 0;
        for(Figure fig: figure){
            if(fig.getColor().equals("Red")){
                sum += fig.perimeter();
            }
        }
        return sum;
    }
    public static double calculateRedAria(Figure[] figure){
        double sum = 0;
        for(Figure fig: figure){
            if(fig.getColor().equals("Red")){
                sum += fig.area();
            }
        }
        return sum;
    }
}
