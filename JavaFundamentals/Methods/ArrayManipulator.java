package JavaFundamentals2021.MethodsExersice1106;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = Arrays.stream(scanner.nextLine().split(" "))
          .mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commands = command.split(" ");
            String typeComm = commands[0];
            switch (typeComm) {
                case "exchange":
                    int exchangeIndex = Integer.parseInt(commands[1]);
                    if (isValidIndex(exchangeIndex, number.length)) {
                        number = exchangeMethod(number, exchangeIndex);
                    }else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String maxEvenOdd = commands[1];
                    if (maxEvenOdd.equals("even")){
                        printMaxIndexEven(number);
                    }else if (maxEvenOdd.equals("odd")){
                        printMaxIndexOdd(number);
                    }
                    break;
                case "min":
                    String minEvenOdd = commands[1];
                    if (minEvenOdd.equals("even")) {
                        printMinIndexEven(number);
                    }else if (minEvenOdd.equals("odd")) {
                        printMinIndexOdd(number);
                    }
                    break;
                case "first":
                    int countFirst = Integer.parseInt(commands[1]);
                    if (!isValidCount(countFirst, number.length)) {
                        System.out.println("Invalid count");
                        command = scanner.nextLine();
                        continue;
                    }
                    String evenOddFirst = commands[2];
                    if (evenOddFirst.equals("even")) {
                        printFirstEven(number,countFirst);
                    }else if (evenOddFirst.equals("odd")) {
                        printFirstOdd(number, countFirst);
                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(commands[1]);
                    if (!isValidCount(countLast, number.length)) {
                        System.out.println("Invalid count");
                        command = scanner.nextLine();
                        continue;
                    }
                    String evenOddLast = commands[2];
                    if (evenOddLast.equals("even")) {
                        printLastEven(number,countLast);
                    }else if (evenOddLast.equals("odd")) {
                        printLastOdd(number,countLast);
                    }
                    break;

            }
            command = scanner.nextLine();
        }
        System.out.print("[");
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                System.out.print(number[i]);
            }else {
                System.out.print(number[i] + ", ");
            }
        }
        System.out.println("]");
    }

    private static boolean isValidIndex(int numberIndex, int length) {
        return numberIndex >= 0 && numberIndex <= length - 1;
    }

    private static int[] exchangeMethod(int[] number, int exchangeIndex) {
        int[] numbersToExchangeIndex = new int[exchangeIndex + 1];
        int[] numbersAfterExchangeIndex = new int[number.length - (exchangeIndex + 1)];
        for (int i = 0; i <= exchangeIndex; i++) {
            int currentElement = number[i];
            numbersToExchangeIndex[i] = currentElement;
        }
        for (int i = exchangeIndex + 1; i < number.length; i++) {
            int currentElement = number[i];
            numbersAfterExchangeIndex[i - (exchangeIndex + 1)] = currentElement;
        }
        int[] finalExchangeArr = new int[number.length];
        for (int i = 0; i < numbersAfterExchangeIndex.length; i++) {
            finalExchangeArr[i] = numbersAfterExchangeIndex[i];
        }
        for (int i = numbersAfterExchangeIndex.length; i < finalExchangeArr.length; i++) {
            finalExchangeArr[i] = numbersToExchangeIndex[i - numbersAfterExchangeIndex.length];
        }
        return finalExchangeArr;
    }

    private static void printMaxIndexEven(int[] number) {
        int maxEven = Integer.MIN_VALUE;
        int maxIndexEven = -1;
        for (int i = 0; i < number.length; i++) {
            int currentNumber = number[i];
            if (currentNumber % 2 == 0 && currentNumber >= maxEven) {
                maxEven = currentNumber;
                maxIndexEven = i;
            }
        }
        if (maxIndexEven == -1) {
            System.out.println("No matches");
        }else {
            System.out.println(maxIndexEven);
        }
    }

    private static void printMaxIndexOdd(int[] number) {
        int maxOdd = Integer.MIN_VALUE;
        int maxIndexOdd = -1;
        for (int i = 0; i < number.length; i++) {
            int currentNumber = number[i];
            if (currentNumber % 2 != 0 && currentNumber >= maxOdd) {
                maxOdd = currentNumber;
                maxIndexOdd = i;
            }
        }
        if (maxIndexOdd == -1) {
            System.out.println("No matches");
        }else {
            System.out.println(maxIndexOdd);
        }
    }

    private static void printMinIndexEven(int[] number) {
        int minEven = Integer.MAX_VALUE;
        int minIndexEven = -1;
        for (int i = 0; i < number.length; i++) {
            int currentNumber = number[i];
            if (currentNumber % 2 == 0 && currentNumber <= minEven) {
                minEven = currentNumber;
                minIndexEven = i;
            }
        }
        if (minIndexEven == -1) {
            System.out.println("No matches");
        }else {
            System.out.println(minIndexEven);
        }
    }

    private static void printMinIndexOdd(int[] number) {
        int minOdd = Integer.MAX_VALUE;
        int minIndexOdd = -1;
        for (int i = 0; i < number.length; i++) {
            int currentNumber = number[i];
            if (currentNumber % 2 != 0 && currentNumber <= minOdd) {
                minOdd = currentNumber;
                minIndexOdd = i;
            }
        }
        if (minIndexOdd == -1) {
            System.out.println("No matches");
        }else {
            System.out.println(minIndexOdd);
        }
    }

    private static void printFirstEven(int[] number, int count) {
        String output = "";
        for (int i = 0; i < number.length; i++) {
            int currentNumber = number[i];
            if (currentNumber % 2 == 0) {
                output += currentNumber;
                count--;
            }
            if (count == 0) {
                break;
            }
        }
        System.out.print("[");
        for (int i = 0; i < output.length(); i++) {
            if (i == output.length() - 1) {
                System.out.print(output.charAt(i));
            }else {
                System.out.print(output.charAt(i) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printFirstOdd(int[] number, int countFirst) {
        String output = "";
        for (int i = 0; i < number.length; i++) {
            int currentNumber = number[i];
            if (currentNumber % 2 != 0) {
                output += currentNumber;
                countFirst--;
            }
            if (countFirst == 0) {
                break;
            }
        }
        System.out.print("[");
        for (int i = 0; i < output.length(); i++) {
            if (i == output.length() - 1) {
                System.out.print(output.charAt(i));
            }else {
                System.out.print(output.charAt(i) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printLastEven(int[] number, int countLast) {
        String lastNumberEven = "";
        for (int i = number.length - 1; i >= 0; i--) {
            int currentNumber = number[i];
            if (currentNumber % 2 == 0) {
                lastNumberEven += currentNumber;
                countLast--;
            }
            if (countLast == 0) {
                break;
            }
        }
        System.out.print("[");
        for (int i = lastNumberEven.length() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(lastNumberEven.charAt(i));
            }else {
                System.out.print(lastNumberEven.charAt(i) + ", ");
            }
        }
        System.out.println("]");
    }

    private static void printLastOdd(int[] number, int countLast) {
        String lastNumberOdd = "";
        for (int i = number.length - 1; i >= 0; i--) {
            int currentNumber = number[i];
            if (currentNumber % 2 != 0) {
                lastNumberOdd += currentNumber;
                countLast--;
            }
            if (countLast == 0) {
                break;
            }
        }
        System.out.print("[");
        for (int i = lastNumberOdd.length() - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(lastNumberOdd.charAt(i));
            }else {
                System.out.print(lastNumberOdd.charAt(i) + ", ");
            }
        }
        System.out.println("]");
    }

    private static boolean isValidCount(int countFirst, int length) {
        return countFirst <= length;
    }
}
