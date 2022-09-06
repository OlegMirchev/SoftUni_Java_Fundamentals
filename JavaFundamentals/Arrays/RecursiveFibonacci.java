package JavaFundamentals2021.ArraysMoreExeresice;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbFibonacci = Integer.parseInt(scanner.nextLine());
        int[] numbMemo = new int[]{1, 1};
        int sum = 0;

        switch (sum) {
            case 1:
            case 2:
                System.out.println("1");
                return;
        }
        for (int i = 2; i < numbFibonacci; i++) {
            sum = numbMemo[0] + numbMemo[1];
            numbMemo = new int[]{numbMemo[1], sum};
        }
        System.out.println(sum);
    }
}
