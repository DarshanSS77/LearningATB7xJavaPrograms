package ex_27072024;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        float avg = 0;
        float total = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of your subject " + (i + 1));
            marks[i] = sc.nextFloat();
        }
        for (int i = 0; i < marks.length; i++) {
            total = (total + marks[i]);
            avg = total / marks.length; 

        }
        System.out.println("Average is " + avg);
        sc.close();
    }

}
