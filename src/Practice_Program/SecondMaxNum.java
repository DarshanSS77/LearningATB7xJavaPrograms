package Practice_Program;

public class SecondMaxNum {
    public static void main(String[] args) {
        int[] num = {22, 5, 1, 88, 61, 32, 5, 4};
        int max = 0;
        int secMax = 0;
        for (int i = 0; i < num.length; i++) {

            if (max < num[i]) {
                secMax = max;
                max = num[i];

            } else if (num[i] > secMax && num[i] != max) {
                secMax = num[i];
            }

        }
        System.out.println("First larget number is " + max);
        System.out.println("Second larget number is " + secMax);
    }
}
