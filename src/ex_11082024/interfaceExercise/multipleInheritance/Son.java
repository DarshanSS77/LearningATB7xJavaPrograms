package ex_11082024.interfaceExercise.multipleInheritance;

public class Son implements Father, Mother {



    @Override
    public void loan() {
        System.out.println("Loan");
    }

    @Override
    public void home() {
        System.out.println("Home");
    }
}
