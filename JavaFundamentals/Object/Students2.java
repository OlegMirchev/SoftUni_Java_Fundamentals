package JavaFundamentals2021.ObjectLAB2306;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<FindStudents> listStudents = new ArrayList<>();


        while (!command.equals("end")) {
            String[] tokens = command.split("\\s+");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String city = tokens[3];
            if (!alreadyExists(firstName, lastName, age, city, listStudents)) {
                FindStudents findStudents = new FindStudents(firstName, lastName, age, city);
                listStudents.add(findStudents);
            }

            command = scanner.nextLine();
        }
        String lineCity = scanner.nextLine();
        for (FindStudents result : listStudents) {
            if (result.getCity().equals(lineCity)) {
                System.out.println(result);
            }
        }
    }

    private static boolean alreadyExists(String firstName, String lastName, int age, String city, List<FindStudents> listStudents) {
        for (FindStudents result : listStudents) {
            if (result.getFirstName().equals(firstName) && result.getLastName().equals(lastName)) {
                result.setAge(age);
                result.setCity(city);
                return true;
            }
        }
        return false;
    }
}
