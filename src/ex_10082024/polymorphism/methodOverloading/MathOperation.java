package ex_10082024.polymorphism;

public class MathOperation {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    double add(double a, int b) {
        return  (a + b);
    }


    String add(String a, String b) {
        return a + b;
    }
}
