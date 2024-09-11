package ex_17082024.wrapperClass;

public class Lab042 {
    public static void main(String[] args) {
     A a = new A();

        System.out.println(a.age);
        A.m1();
        System.out.println(A.discount); 

        A a12 = new A();
    }
}

class A {
    int age = 10;
   static int discount = 200;

    static {
        System.out.println("SIB");
    }
    {
        System.out.println("IIB");
    }

    static void m1(){
        System.out.println("M1 block");
    }

    void m2(){
        System.out.println("m2 block");
    }

}
