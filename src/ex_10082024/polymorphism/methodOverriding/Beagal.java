package ex_10082024.polymorphism.methodOverriding;

public class Beagal extends Dog{
    @Override
    void bark() {
        System.out.println("I am beagal, I can bark");
    }

    void eat(){
        System.out.println("I am beagal, I am eating");
    }
}
