package ex_11082024.staticKeyword;

public class Lab038 {
    public static void main(String[] args) {
        System.out.println(ATB.courseName);

        ATB a = new ATB("Darshan");
        System.out.println( a.getName());

        ATB a2 = new ATB("bob");
    }

}

class ATB{

    private String name;
    static String courseName = "ATB 7X";
   


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    ATB(String name){
        this.name = name;
    }
    {
        System.out.println(courseName);
        System.out.println("IIB");
    }
    static {
        int x = 20;
        System.out.println("Static block");
    }

}
