package JavaFundamentals2021.BasicSyntaxLAB1905.PBMoreExarsiceBasicSyntax;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1 = Integer.parseInt(scanner.nextLine());
        int numb2 = Integer.parseInt(scanner.nextLine());
        int numb3 = Integer.parseInt(scanner.nextLine());

        int max = Math.max(numb1, Math.max(numb2, numb3));
        int min = Math.min(numb1, Math.min(numb2, numb3));
        int middle = numb1 + numb2 + numb3 - max - min;

        System.out.println(max);
        System.out.println(middle);
        System.out.println(min);


    }
}
