package ex_22082024.threading.generics;

public class MaxThree {

    public static void main(String[] args) {
        System.out.println(maxThree(120, 1000, 540));
        System.out.println(maxThree(1.2, 2.5, 5.2));
        System.out.println(maxThree('a', 'c', 't'));
        System.out.println(maxThree("zarshan","aachin","harshan"));

    }

    public static <T extends Comparable<T>> T maxThree(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}
