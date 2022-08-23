package JavaFundamentals2021.DataTypesExersice2805;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower = Integer.parseInt(scanner.nextLine());
        int distanceBetweenPokeTargets = Integer.parseInt(scanner.nextLine());
        int exhaustionFactor = Integer.parseInt(scanner.nextLine());
        double originalValue = pokePower;
        int countPokesSuccess = 0;

        while (pokePower >= distanceBetweenPokeTargets) {
            if (distanceBetweenPokeTargets == 0) {
                break;
            }
            pokePower -= distanceBetweenPokeTargets;
            countPokesSuccess++;

            if (pokePower == originalValue * 0.50) {
                if (exhaustionFactor == 0) {
                    continue;
                }
                pokePower /= exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(countPokesSuccess);
    }
}
