package day6;

public class Task3 {
    public static void main(String[] args) {
        Tutor tutor = new Tutor("Иванов Иван Иванович", "Математика");
        Student student = new Student("Петров Петр Петрович");
        tutor.evaluate(student);
    }
}
