package ex_11082024.Abstraction.loanExample;

public class Son extends Father{


    @Override
    void loan50k() {
        System.out.println("I will pay 50k loan");
    }
    void loan10k(){
        System.out.println("Son loan 10k");
    }
}
