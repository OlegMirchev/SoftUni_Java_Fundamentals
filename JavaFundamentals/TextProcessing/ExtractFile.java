package JavaFundamentals2021.TextProcessingExercise2307;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\\\");
        String[] file = text[text.length - 1].split("\\.");

        System.out.println("File name: " + file[0]);
        System.out.println("File extension: " + file[1]);
    }
}
