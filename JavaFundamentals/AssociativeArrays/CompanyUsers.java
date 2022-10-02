package JavaFundamentals2021.MapsLambdaStreamAPIExercise1607;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, List<String>> mapCompanies = new TreeMap<>();

        while (!command.equals("End")) {
            String[] newCommand = command.split(" -> ");
            String companies = newCommand[0];
            String employeesNumber = newCommand[1];

            if (!mapCompanies.containsKey(companies)) {
                mapCompanies.put(companies, new ArrayList<>());
                mapCompanies.get(companies).add(employeesNumber);
            }else {
                if (mapCompanies.get(companies).contains(employeesNumber)) {
                    command = scanner.nextLine();
                    continue;
                }
                mapCompanies.get(companies).add(employeesNumber);
            }
            command = scanner.nextLine();
        }
        mapCompanies.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().forEach(result -> System.out.println("-- " + result));
        });
    }
}
