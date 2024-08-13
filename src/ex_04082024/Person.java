package ex_04082024;

public class Person {

    String name = "first name";
    long phone;

    Person() {
        System.out.println("I am default constructor");
    }

    Person(String givenName) {
        name = givenName;

    }

    Person(String s, long phoneNumber) {
        this.phone = phoneNumber;
        this.name = s;

    }
}
