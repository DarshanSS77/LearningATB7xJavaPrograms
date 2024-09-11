package ex_17082024.exceptions;

public class Lab043 {
    public static void main(String[] args) {
        String ip = args[0];
        System.out.println(ip);

        int a = Integer.parseInt(ip);
        int b = 1000/a;
        System.out.println(b);
    }
}
