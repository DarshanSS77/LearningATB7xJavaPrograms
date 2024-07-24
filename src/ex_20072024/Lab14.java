package ex_20072024;

public class Lab14 {
    public static void main(String[] args) {
        boolean a = true;
        a = !a;
        if (2 + 2 > 5) {
            System.out.println("Inside the if statement");
        } else {
            System.out.println("Inside the else statement");
        }
        System.out.println("Outside the loop " + a);
    }
}
