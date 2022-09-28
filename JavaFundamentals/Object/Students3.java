package JavaFundamentals2021.ObjectExersice2506;

import java.util.*;
import java.util.stream.Collectors;

public class Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        List<Person> listStudents = new ArrayList<>();


        for (int i = 1; i <= number; i++) {
            String[] word = scanner.nextLine().split("\\s+");
            String firstName = word[0];
            String lastName = word[1];
            double grade = Double.parseDouble(word[2]);

            Person person = new Person(firstName, lastName, grade);
            listStudents.add(person);

        }
        listStudents = listStudents.stream().sorted(Comparator.comparingDouble(Person::getGrate)).collect(Collectors.toList());
        Collections.reverse(listStudents);

        for (Person listStudentResult : listStudents) {
            System.out.println(listStudentResult);
        }
    }

    public static class Person {
        private String firstName;
        private String lastName;
        private double grate;

        public Person(String firstName, String lastName, double grate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grate = grate;
        }

        public String getFirstName() {
            return firstName;
        }

        public double getGrate() {
            return grate;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f", firstName, lastName, grate);
        }
    }
}
