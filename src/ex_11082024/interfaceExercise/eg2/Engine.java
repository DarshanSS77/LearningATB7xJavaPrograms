package ex_11082024.interfaceExercise.eg2;

public interface Engine {
    default void start(){
        System.out.println("Engine started");
    }

    static void stop(){
        System.out.println("Engine stopped");
    }
    void m1();

    void newFunction();
    }

