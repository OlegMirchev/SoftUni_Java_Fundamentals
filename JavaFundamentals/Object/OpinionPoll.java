package JavaFundamentals2021.ObjectExersice2506;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OpinionPoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= numb; i++) {
            String[] personInformation = scanner.nextLine().split("\\s+");
            String name = personInformation[0];
            int age = Integer.parseInt(personInformation[1]);

            Person person = new Person(name, age);
            if (age > 30) {
                personList.add(person);

            }
        }
        personList = personList.stream().sorted(Comparator.comparing(Person::getName)).collect(Collectors.toList());

        for (Person personResult : personList) {
            System.out.println(personResult);
        }
    }

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
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

        @Override
        public String toString() {
            return String.format("%s - %d", name, age);
        }
    }
}

