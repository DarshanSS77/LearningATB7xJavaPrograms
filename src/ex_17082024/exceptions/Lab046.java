package ex_17082024.exceptions;

public class Lab046 {

    public static void main(String[] args) {
        int b = 0;
        try {
//            String ip = args[0];
            String ip = "knk";
            int a = Integer.parseInt(ip);
            b = 1000 / a;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);
    }
}
