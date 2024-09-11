package ex_18082024.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab049 {

    public static void main(String[] args) {
        String path = "c://a.file";
        File file = new File(path);

        try {
            FileReader fileReader = new FileReader(file);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
//        catch (FileNotFoundException e) {
//            System.out.println("File not found");;
//        }

    }

}
