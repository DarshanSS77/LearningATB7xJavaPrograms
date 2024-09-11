package ex_17082024.wrapperClass;

public class Lab040 {
    public static void main(String[] args) {
        //Primitive to wrapper
        int a = 40;
        Integer b = a; // Auto boxing

        System.out.println(a);
        System.out.println(b);

        System.out.println(b.equals(52));

        //Wrapper to primitive
        Integer a1 = 50;
        int b1 = a1; // un boxing

        System.out.println(a1);
        System.out.println(b1);
    }
}
