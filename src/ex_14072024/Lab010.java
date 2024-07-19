package ex_14072024;

public class Lab010 {
    public static void main(String[] args) {
        String s1 = "Darshan"; //SCP -> new value created
        s1 = "Dhoni"; //SCP -> new value created
        s1 = "Bob";  //SCP -> new value created
        s1 = "Darshan"; //SCP -> no new value created, it is pointing same value created before

        String str1 = new String("New string"); //This creates a new String object with the content "New string". A new object is created in the heap memory.
        String str2 = new String("New string"); //his also creates a new String object with the same content "New string" Even though the content is the same, a new object is created in the heap memory.
        String str3 = new String("New string");

        boolean compare  = str1 == str2; //== operator compares the references
        System.out.println(compare); // false ->

    }
}
