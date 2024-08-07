package day6;

import java.util.Random;

public class Tutor {
    private String fio;
    private String subject;

    public Tutor(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student){
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;
        String evaluation = null;
        switch(randomValue) {
            case 2: evaluation = "неудовлетворительно"; break;
            case 3: evaluation = "удовлетворительно"; break;
            case 4: evaluation = "хорошо"; break;
            case 5: evaluation = "отлично"; break;
        }
        System.out.println("Преподаватель "+ this.fio + " оценил студента " + student.getFio() + " по предмету " + this.subject + " на оценку " + evaluation);

    }
}
