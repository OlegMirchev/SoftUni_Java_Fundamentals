package JavaFundamentals2021.ArraysMoreExeresice;

import java.util.Scanner;

public class PascalTriangle1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println("1");

        if (n == 1) {
            return;
        }

        int[] arrays = new int[]{1, 1};
        for (int numb1 : arrays) {
            System.out.print(numb1 + " ");
        }
        for (int i = 1; i < n - 1; i++) {

            int[] newArray = new int[arrays.length + 1];
            newArray[0] = 1;
            newArray[newArray.length - 1] = 1;

            for (int k = 1; k < newArray.length - 1; k++) {
                newArray[k] = arrays[k - 1] + arrays[k];
            }
            System.out.println();
            for (int numb2 : newArray) {
                System.out.print(numb2 + " ");
            }
            arrays = newArray;
        }
    }
}

