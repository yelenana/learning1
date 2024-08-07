package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Tom", "505");
        Tutor tutor = new Tutor("John", "MAth");


        student.printInfo();
        tutor.printInfo();

        System.out.println(student.getName());
        System.out.println(student.getGroupName());

        System.out.println(tutor.getName());
        System.out.println(tutor.getSubjectName());

    }
}
