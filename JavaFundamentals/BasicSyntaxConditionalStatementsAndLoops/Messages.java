package JavaFundamentals2021.BasicSyntaxLAB1905.PBMoreExarsiceBasicSyntax;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String word = "";

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number == 0) {
                word += " ";
                continue;
            }
            int digit = String.valueOf(number).length();
            int mainDigit = number % 10;
            int offset = (mainDigit - 2) * 3;
            if (mainDigit == 8 || mainDigit == 9) {
                offset += 1;
            }
            int letter = (offset + digit - 1);

            if (mainDigit == 2) {
                switch (letter) {
                    case 0:
                        word += "a";
                        break;
                    case 1:
                        word += "b";
                        break;
                    case 2:
                        word += "c";
                        break;
                }
            } else if (mainDigit == 3) {
                switch (letter) {
                    case 3:
                        word += "d";
                        break;
                    case 4:
                        word += "e";
                        break;
                    case 5:
                        word += "f";
                        break;
                }
            } else if (mainDigit == 4) {
                switch (letter) {
                    case 6:
                        word += "g";
                        break;
                    case 7:
                        word += "h";
                        break;
                    case 8:
                        word += "i";
                        break;
                }
            } else if (mainDigit == 5) {
                switch (letter) {
                    case 9:
                        word += "j";
                        break;
                    case 10:
                        word += "k";
                        break;
                    case 11:
                        word += "l";
                        break;
                }
            } else if (mainDigit == 6) {
                switch (letter) {
                    case 12:
                        word += "m";
                        break;
                    case 13:
                        word += "n";
                        break;
                    case 14:
                        word += "o";
                        break;
                }
            } else if (mainDigit == 7) {
                switch (letter) {
                    case 15:
                        word += "p";
                        break;
                    case 16:
                        word += "q";
                        break;
                    case 17:
                        word += "r";
                        break;
                    case 18:
                        word += "s";
                        break;
                }
            } else if (mainDigit == 8) {
                switch (letter) {
                    case 19:
                        word += "t";
                        break;
                    case 20:
                        word += "u";
                        break;
                    case 21:
                        word += "v";
                        break;
                }
            } else if (mainDigit == 9) {
                switch (letter) {
                    case 22:
                        word += "w";
                        break;
                    case 23:
                        word += "x";
                        break;
                    case 24:
                        word += "y";
                        break;
                    case 25:
                        word += "z";
                        break;
                }
            }
        }
        System.out.print(word);
    }
}
