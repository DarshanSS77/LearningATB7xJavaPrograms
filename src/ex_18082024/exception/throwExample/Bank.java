package ex_18082024.exception.throwExample;

public class Bank {

    private Integer amount;
    private String name;

    Bank(String name, Integer amount) {
        this.amount = amount;
        this.name = name;
    }

    public Integer getBalance() {
        return amount;
    }

    public void setBalance(Integer balance) {
        this.amount = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer add(Bank bankName) {
        if (!bankName.name.equalsIgnoreCase("INR")){
            try {
                throw new Exception("Currency mismatch");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        Integer sum = this.amount + bankName.amount;
        return sum;
    }
}
