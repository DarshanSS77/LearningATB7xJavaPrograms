package Practice_Program;

import java.util.Scanner;

public class TriangleClassifier {


// Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle
// side1, side2, side3 ->

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the side 1");
        int side1 = scanner.nextInt();
        System.out.println("Enter the length of the side 2");
        int side2 = scanner.nextInt();
        System.out.println("Enter the length of the side 3");
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3) {
            System.out.println("It is equilateral triangle");
        } else if (side1==side2 || side1==side3 || side2==side3) {
            System.out.println("It is isosceles triangle");
        }
        else {
            System.out.println("It is Scalene triangle");
        }
    }

}
