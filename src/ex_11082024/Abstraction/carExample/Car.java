package ex_11082024.Abstraction.carExample;

public class Car extends Engine {

    @Override
    void openCar() {
        System.out.println("Car opened using keys");
    }

    @Override
    void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    void gearFunction() {
        System.out.println("Gear function activated");
    }

    @Override
    void stopEngine() {
        System.out.println("Engine stopped");

    }

    @Override
    void speed() {
        System.out.println("Speed of the car");
    }


}
