package Lab_21072024;

public class Lab032 {
    public static void main(String[] args) {
        int[] salaries = {12, 4, 50, 8, 15, 22};
        int intial = 0;
        for (int i = 0; i < salaries.length; i++) {
            if (intial < salaries[i]) {
                intial = salaries[i];
            }
        }
        System.out.println(intial);
    }
}
