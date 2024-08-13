package ex_04082024;

import java.util.Scanner;

public class CallingBankAccount {

    public static void main(String[] args) {
//        BankAccount b1 = new BankAccount();
//
//        System.out.println(b1.name);
//        System.out.println(b1.balance);
//        System.out.println(b1.code);
//
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Bank name");
        String name = sc.next();

        System.out.println("Enter your Bank name");
        int balance = sc.nextInt();

        System.out.println("Enter your Bank name");
        String code = sc.next();


        BankAccount b2 = new BankAccount(name, balance, code);

        System.out.println(b2.name);
        System.out.println(b2.balance);
        System.out.println(b2.code);

        sc.close();
    }
}
