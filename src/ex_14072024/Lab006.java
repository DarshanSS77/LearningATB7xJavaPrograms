package ex_14072024;

public class Lab006 {

    public static void main(String[] args) {
//        byte a = 10;
//        int b = a; //Implicit type casting - JVM

        //Widening
        byte a = 10;
        int b = a; // valid - Implicit casting
        int c = (int) a; //valid - Explicit casting - no data loss

        //Narrowing
        int x = 250;
//      byte y = x ; //Invalid - Implicit casting
        byte z = (byte) x; // valid - Explicit casting - data loss
    }
}
