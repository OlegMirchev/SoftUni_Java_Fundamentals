package JavaFundamentals2021.BasicSyntaxLAB1905.PBMoreExarsiceBasicSyntax;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder inputNew = new StringBuilder();
        inputNew.append(input);
        inputNew.reverse();
        System.out.println(inputNew);
    }
}
