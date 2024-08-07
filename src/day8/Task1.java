package day8;
public class Task1 {
    public static void main(String[] args) {
        String s = "";

        long before = System.currentTimeMillis();
        for (int i = 0; i < 2001; i++) {
            s += " "+i;
        }
        long after = System.currentTimeMillis();
        System.out.println("Time for String "+ (after - before));
        System.out.println(s);


        StringBuilder sb = new StringBuilder("");
        before = System.currentTimeMillis();
        for (int i = 0; i < 2001; i++) {
            sb.append(i).append(" ");
        }
        after = System.currentTimeMillis();
        System.out.println("Time for StringBuilder "+ (after - before));
        System.out.println(sb);

        Airplane airplane = new Airplane("Boeing", 2000);
        System.out.println(airplane.toString());;

    }
}
