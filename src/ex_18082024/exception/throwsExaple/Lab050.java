package ex_18082024.exception.throwsExaple;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab050 {
    public static void main(String[] args) throws FileNotFoundException{
        readFile();
    }


    private static void readFile() throws FileNotFoundException {
        System.out.println("Hello");
        String path = "c://a.file";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);

    }
}