package ex_18082024.exception.throwExample;

import java.util.Scanner;

public class Lab052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.next();

        if (name.equalsIgnoreCase("Darshan")) {
            try {
                throw new Exception("Not allowed");
            } catch (Exception e) {
                throw new RuntimeException(e);

            }
        } else {
            System.out.println("Allowed");
        }
        sc.close();
    }
}
