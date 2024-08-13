package ex_04082024;

public class BankAccount {

    String name;
    int balance;
    String code;

    BankAccount() {
        name = "SBI";
        balance = 100;
        code = "SBI0001";
    }

    BankAccount(String nameB, int balanceB, String codeB) {
        this.name = nameB;
        this.balance = balanceB;
        this.code = codeB;
    }

    BankAccount(String nameB, int balanceB) {
        this.name = nameB;
        this.balance = balanceB;

    }

    BankAccount(String nameB) {
        this.name = nameB;

    }
}
