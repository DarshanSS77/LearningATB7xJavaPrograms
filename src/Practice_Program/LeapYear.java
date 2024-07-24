package Practice_Program;

import java.util.Scanner;

public class LeapYear {
    //    Find the given input year is Leap year or not
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int input = scanner.nextInt();

        if (input % 4 == 0) {
            System.out.println("It is a leap year😊");
        } else {
            System.out.println("Its is not a leap year😁");
        }
    }

}
