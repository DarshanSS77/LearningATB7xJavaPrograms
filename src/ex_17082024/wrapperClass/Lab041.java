package ex_17082024.wrapperClass;

public class Lab041 {
    public static void main(String[] args) {
        String num = "10";
        System.out.println(num); //String
        Integer a = Integer.valueOf(num); //Convert string to Integer(Wrapper class)
        System.out.println(a); //Integer


        int b = Integer.parseInt(num);
        System.out.println(b);
    }
}
