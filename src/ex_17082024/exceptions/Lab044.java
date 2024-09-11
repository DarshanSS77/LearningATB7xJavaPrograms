package ex_17082024.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab044 {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("C:\\SDET\\Notes");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("continue");
    }
}
