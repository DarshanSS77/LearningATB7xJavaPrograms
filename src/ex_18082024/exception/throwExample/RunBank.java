package ex_18082024.exception.throwExample;

public class RunBank {
    public static void main(String[] args) {
        Bank sbi = new Bank("INR", 100);
        Bank icici = new Bank("INR", 20);

        System.out.println(sbi.add(icici));

        Bank jp = new Bank("USD", 500);
        Integer newTotal = sbi.add(jp);
        System.out.println(newTotal);
    }
}
