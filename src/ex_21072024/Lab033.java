package Lab_21072024;

public class Lab033 {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
                System.out.print("\t");

            }
            System.out.println();

        }
    }


}
