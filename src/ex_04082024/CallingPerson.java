package ex_04082024;

public class CallingPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.name);
        System.out.println(p1.phone);


        Person p2 = new Person("Darshan");
        System.out.println(p2.name);

        Person p3 = new Person("Bob", 1122334455);
        System.out.println(p3.name);
        System.out.println(p3.phone);

    }
}
