package ex_22082024.threading.generics;

public class Lab057 {
    public static void main(String[] args) {
        fun(1);
//        fun(1.1); //give error

        genFun(2);
        genFun(2.5);
        genFun("Darshan");
        genFun('a');
    }

    public static void fun(int a) {
        System.out.println(a);
    }

    //Generic function

    public static <T> void genFun(T a) {
        System.out.println(a);
    }
}
