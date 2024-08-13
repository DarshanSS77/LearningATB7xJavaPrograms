package ex_21072024;

public class Lab029 {

    public static void main(String[] args) {
        //5! = 5*4*3*2*1
        int n = 3;
        int  i = 1;
        int fact = 1;
        while (i<=n){
            fact = fact*i;

            i++;
        }
        System.out.println(fact);
    }
}
