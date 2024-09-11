package ex_11082024.Abstraction.loanExample;

public class Run {
    public static void main(String[] args) {
        Son s = new Son();
        s.loan50k();
        s.loan20k();
        s.loan10k();

        Father f= new Son();
        f.loan20k();
        f.loan50k();

    }

}
