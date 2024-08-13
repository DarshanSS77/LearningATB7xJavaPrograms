package ex_10082024.polymorphism.superKeyword;

public class Lab038 {
    public static void main(String[] args) {
        Car c = new Car();
        c.message();
        c.display();

    }
}


class Car extends Vehicle {
    private int maxSpeed = 240;

    Car(){
        super();
        System.out.println("DC of Car");
    }
    void display() {
//        System.out.println("Car speed is ->" + this.maxSpeed);
        System.out.println("Vehicle speed is -> " + this.maxSpeed);
        System.out.println("Vehicle speed is -> " + super.maxSpeed);
        super.message();
        this.message();
    }

    void message() {
        System.out.println("Car class");
    }

}

class Vehicle {
    public int maxSpeed = 120;

    Vehicle(){
        System.out.println("DC of vehicle");
    }
    void message() {
        System.out.println("Vehicle class");
    }
}
