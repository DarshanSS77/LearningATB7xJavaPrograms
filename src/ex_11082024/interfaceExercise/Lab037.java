package ex_11082024.interfaceExercise;

public class Lab037 {

}


    interface I{}
    class A{} // con 2 usages 1 inheritor new
    class B{}
    abstract class C{}
    class Test1 extends A{} // Ok? no usages new *
    class Test2 extends B{}
    // class Test3 extends A,B{} // Multiple Inheritance
    class Testo implements I{}
    interface I1{ }
    interface I2{}
    class Test4 implements I1,I2{} // multiple Inheritance with interface
    class Test5 extends A implements I1, I2{}
//class Test6 implements I1 extends A{}// Ok
    interface I3 extends I{}
//interface 14 implements A{}
//interface 15 extends A, B{}
    interface I6 extends I1, I2{}
//interface I7 implements Test2{}
//interface 17 extends C{}






