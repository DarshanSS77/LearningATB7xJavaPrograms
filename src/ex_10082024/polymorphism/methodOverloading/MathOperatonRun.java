package ex_10082024.polymorphism;

public class MathOperatonRun {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();

        System.out.println(m.add(10, 20));
        System.out.println(m.add(10.5, 20.5));

        System.out.println(m.add(10.6, 20));

        System.out.println(m.add("darsh", "ss"));


    }
}
