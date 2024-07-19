package ex_14072024;

public class Lab009 {
    public static void main(String[] args) {
        String name = "Darshan";  // It's store in SCP(String constant pool )
        String name2 = new String("Darshan"); // It's stored in heap

        boolean compare = name == name2;  //Reference Comparison: The == operator checks whether the two references, name and name2, point to the same object in memory.
        boolean comapre2 = name.equals(name2); //Value Comparison: The equals method of the String class checks whether the two strings contain the same sequence of characters.
        System.out.println(compare); //false
        System.out.println(comapre2); //true


    }
}
