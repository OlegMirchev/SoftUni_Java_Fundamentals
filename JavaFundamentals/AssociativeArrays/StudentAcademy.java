package JavaFundamentals2021.MapsLambdaStreamAPIExercise1607;

import java.util.*;
import java.util.stream.Collectors;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> mapStudents = new LinkedHashMap<>();

        int average = 0;

        for (int i = 1; i <= n; i++) {
            String nameStudent = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!mapStudents.containsKey(nameStudent)) {
                mapStudents.put(nameStudent, new ArrayList<>());
                mapStudents.get(nameStudent).add(grade);
            }else {
                mapStudents.get(nameStudent).add(grade);
            }
        }
        for (Map.Entry<String, List<Double>> listEntry : mapStudents.entrySet()) {
            average = listEntry.getValue().size();
            double newGrades = 0.0;
            for (int i = 0; i <= listEntry.getValue().size(); i++) {
                newGrades += listEntry.getValue().get(0);
                listEntry.getValue().remove(0);
            }
            listEntry.getValue().add(0, newGrades / average);
        }
        mapStudents.entrySet().stream().filter(result -> result.getValue().get(0) >= 4.50)
                .sorted((value1, value2) -> Double.compare(value2.getValue().get(0), value1.getValue().get(0)))
                .forEach(result -> System.out.printf("%s -> %.2f%n", result.getKey(), result.getValue().get(0)));
    }
}
