package ex_20072024;

import java.util.Scanner;

public class Lab19 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character");
        char c = sc.next().charAt(0);

        switch (c) {
            case 'a':
                System.out.println("Its Vowel");
                break;
            case 'e':
                System.out.println("Its Vowel");
                break;
            case 'i':
                System.out.println("Its Vowel");
                break;
            case 'o':
                System.out.println("Its Vowel");
                break;
            case 'u':
                System.out.println("Its Vowel");
                break;
            default:
                System.out.println("Its consonents");
        }
    }
}
