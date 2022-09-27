package JavaFundamentals2021.ObjectExersice2506;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OrderByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while (!command.equals("End")) {

            String[] personInformation = command.split("\\s+");
            String name = personInformation[0];
            String ID = personInformation[1];
            int age = Integer.parseInt(personInformation[2]);

            Person person = new Person(name, ID, age);
            personList.add(person);

            command = scanner.nextLine();
        }
        personList = personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());

        for (Person personResult : personList) {
            System.out.println(personResult);
        }
    }

    public static class Person {
        private String name;
        private String ID;
        private int age;

        public Person(String name, String ID, int age) {
            this.name = name;
            this.ID = ID;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


        public void setID(String ID) {
            this.ID = ID;
        }

        @Override
        public String toString() {
            return String.format("%s with ID: %s is %d years old.", name, ID, age);
        }
    }
}
