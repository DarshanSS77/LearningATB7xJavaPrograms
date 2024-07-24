package Practice_Program;

import java.util.Scanner;

public class FizzBuzz {
    /*
        Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."

     */

    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int input = scanner.nextInt();

        if (input % 3 == 0 && input % 5 == 0) {
            System.out.println(input + " is Fizz Buzz number");
        } else if (input % 3 == 0) {
            System.out.println(input + " is Fizz number");
        } else if (input % 5 == 0) {
            System.out.println(input + " is Buzz number");
        } else {
            System.out.println(input + " is not Fizz buzz number ");
        }
    }

     */

    public static void main(String[] args) {
//        int input = 50;

        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("Fizz Buzz ->" + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz ->" + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz ->" + i);
            } else {
                System.out.println("Not Fizz Buzz ->" + i);
            }

        }
    }
}

