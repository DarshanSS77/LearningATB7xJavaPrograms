package ex_20072024;

import java.util.Scanner;

public class Lab15 {
    /*

    Grade Calculator:
Write a program that calculates and displays the letter grade for a given numerical score
(e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59
     */


    /*


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int input = sc.nextInt();

        if (input >= 90 && input <= 100) {
            System.out.println("Excelent! You got A band");
        } else if (input >= 80 && input <= 89) {
            System.out.println("Very Good! You got B band");
        } else if (input >= 70 && input <= 79) {
            System.out.println("Good! You got C band");
        } else if (input >= 60 && input <= 69) {
            System.out.println("Not bad! You got D band");
        } else if (input >= 0 && input <= 59) {
            System.out.println("bad! You got F band");
        } else {
            System.out.println("Enter correct marks");
        }
        sc.close();
    }

    */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int input = sc.nextInt();
        char grade = 'F';
        if (input >= 90 && input <= 100) {
            grade = 'A';
        } else if (input >= 80 && input <= 89) {
            grade = 'B';
        } else if (input >= 70 && input <= 79) {
            grade = 'C';
        } else if (input >= 60 && input <= 69) {
            grade = 'D';
        } else if (input >= 0 && input <= 59) {
            grade = 'F';
        } else {
            System.out.println("Enter correct marks");
        }

        System.out.println("Your Grade is " + grade);
        sc.close();
    }
}

