package ex_14072024;

public class Lab007 {
    public static void main(String[] args) {
        int courseFee = 100;
        float gstAmt = 18.5f;
//        int totalAmt = courseFee + gstAmt ; // Implicit - Narrowing

        int totalAmt = courseFee + (int)gstAmt ; // Explicit - Narrowing -Loss

        System.out.println(totalAmt);
    }
}
