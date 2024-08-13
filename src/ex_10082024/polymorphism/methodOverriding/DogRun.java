package ex_10082024.polymorphism.methodOverriding;

public class DogRun {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();

        Beagal b = new Beagal();
        b.bark();

        Dog d_b = new Beagal();
        d_b.bark();

        d_b.eat();
    }
}
