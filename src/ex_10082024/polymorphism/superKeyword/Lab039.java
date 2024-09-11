package ex_10082024.polymorphism.superKeyword;


/*
super - to access parent class
super.variableName
super.method
super() -> default constructor
super(12) -> constructor parameterized
 */




public class Lab039 {
}

class Person1 {
    Person1() {
        System.out.println("Person1 - DC");
    }

    Person1(int a) {
        System.out.println("Person1 - DC -A1");
    }

    Person1(String a, int b) {
        System.out.println("Person1 - DC -A2");
    }
}

class Student1 extends Person1 {
    Student1() {

        System.out.println("Student1 - DC");
    }

    Student1(int a) {
        super();
//        this();

    }

}
