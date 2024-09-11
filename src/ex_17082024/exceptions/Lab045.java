package ex_17082024.exceptions;

public class Lab045 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
//            e.printStackTrace();
            throw new RuntimeException(e);
//            System.out.println("Cannot devide by zero");
        }
//        finally {
//            System.out.println("Continue");
//        }
        System.out.println("end of the program");
    }
}
