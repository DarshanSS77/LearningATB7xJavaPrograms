package ex_14072024;

public class Lab008 {
    public static void main(String[] args) {
//        Post increment - value stored first and increment later
//        Pre increment - value increment first and stored later
        int a = 10;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------------");

        int c = 15;
        System.out.println(c++);
        System.out.println(++c);

        System.out.println("-------------------------");

        int d = 20;
//        System.out.println(d++ + d);
//        System.out.println(d++ + ++d);
        System.out.println(++d + d++);
//        System.out.println(++d + ++d);
//        System.out.println(d);

    }
}
