package ex_04082024.HeirarchicalInheritance;

public class Runner {

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.c1();
        c1.father();

        Child2 c2 = new Child2();
        c2.father();
        c2.c2();

        Child3 c3 = new Child3();
        c3.father();
        c3.c3();


    }
}
