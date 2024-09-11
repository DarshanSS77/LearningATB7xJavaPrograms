package ex_18082024.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab051 {
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException {
        try {
            int a = 10/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("exception");
        }

//        int a = 10 / 0;
//        System.out.println(a);

        System.out.println("Hello");
        String path = "c://a.file";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);


    }
}
