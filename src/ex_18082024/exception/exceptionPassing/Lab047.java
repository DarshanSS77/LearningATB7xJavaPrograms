package ex_18082024.exception.exceptionPassing;

public class Lab047 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        Integer[] i = new Integer[2];
        System.out.println(i[3]);
    }
}
