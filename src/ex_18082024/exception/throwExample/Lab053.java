package ex_18082024.exception.throwExample;

public class Lab053 {
    public static void main(String[] args) {
        int x = 4;

        if (x==0){
            throw new RuntimeException("Enter non zero number");
        }
        int y = 10/x;
        System.out.println(y);
    }
}
