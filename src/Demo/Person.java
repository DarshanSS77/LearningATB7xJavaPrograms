package Demo;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return name.equals(other.name) && age == other.age;
    }
    public void run(){
        System.out.println(this);
    }

    public static void main(String[] args) {
        Person p = new Person("a",2);
      p.run();
    }
}

//Person p1 = new Person("John", 30);
//Person p2 = new Person("John", 30);
//Person p3 = new Person("Jane", 30);
//
//System.out.println(p1.equals(p2)); // prints true
//        System.out.println(p1.equals(p3)); // prints false


