package JavaFundamentals2021.BasicSyntaxLAB1905.PBMoreExarsiceBasicSyntax;

import java.util.Scanner;

public class SortNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb1 = Integer.parseInt(scanner.nextLine());
        int numb2 = Integer.parseInt(scanner.nextLine());
        int numb3 = Integer.parseInt(scanner.nextLine());

        if (numb1 > numb2 && numb1 > numb3) {
            System.out.println(numb1);
            if (numb2 >= numb3) {
                System.out.println(numb2);
                System.out.println(numb3);
            }else {
                System.out.println(numb3);
                System.out.println(numb2);
            }
        }else if (numb2 > numb1 && numb2 > numb3) {
            System.out.println(numb2);
            if (numb1 >= numb3) {
                System.out.println(numb1);
                System.out.println(numb3);
            }else {
                System.out.println(numb3);
                System.out.println(numb1);
            }
        }else if (numb3 > numb1 && numb3 > numb2) {
            System.out.println(numb3);
            if (numb1 >= numb2) {
                System.out.println(numb1);
                System.out.println(numb2);
            }else {
                System.out.println(numb2);
                System.out.println(numb1);
            }
        }
    }
}
