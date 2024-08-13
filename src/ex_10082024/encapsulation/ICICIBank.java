package ex_10082024.encapsulation;

public class ICICIBank {

    private String name;
    private long balance;

    ICICIBank(String name, long balance) {
        this.name = name;
        this.balance = balance;

    }

    public String getName() {
        return name;
    }


    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isAuth) {
        if (isAuth) {
            System.out.println("Allowed");

            this.balance = balance;
        } else {
            System.out.println("Not allowed");
        }
    }
}
