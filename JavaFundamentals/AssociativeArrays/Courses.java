package JavaFundamentals2021.MapsLambdaStreamAPIExercise1607;

import java.util.*;
import java.util.stream.Collectors;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, List<String>> mapStudents = new LinkedHashMap<>();

        while (!command.equals("end")) {
            String[] newCommand = command.split(" : ");
            String course = newCommand[0];
            String nameStudents = newCommand[1];

            if (!mapStudents.containsKey(course)) {
               mapStudents.put(course, new ArrayList<>());
               mapStudents.get(course).add(nameStudents);
            }else {
                mapStudents.get(course).add(nameStudents);
            }

            command = scanner.nextLine();
        }
        mapStudents.entrySet().stream().sorted((value1, value2) ->
                Integer.compare(value2.getValue().size(), value1.getValue().size()))
                .forEach(entry -> {
                        System.out.println(entry.getKey() + ": " + entry.getValue().size());
                        entry.getValue().stream().sorted().forEach(nameStudents -> System.out.println("-- " + nameStudents));
                });
    }
}
