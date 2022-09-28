package JavaFundamentals2021.ObjectExersice2506;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<DataVehicle> carOrTruck = new ArrayList<>();
        int carCount = 0;
        int truckCount = 0;
        double carSum = 0.0;
        double truckSum = 0.0;

        while (!command.equals("End")) {
            String[] datesVehicle = command.split("\\s+");
            String typeOfVehicle = datesVehicle[0];
            String model = datesVehicle[1];
            String color = datesVehicle[2];
            int horsepower = Integer.parseInt(datesVehicle[3]);

            DataVehicle dataVehicle = new DataVehicle(typeOfVehicle, model, color, horsepower);
            carOrTruck.add(dataVehicle);

            if (dataVehicle.getTypeOfVehicle().equals("car")) {
                carSum += dataVehicle.getHorsepower();
                carCount++;
            }else {
                truckSum += dataVehicle.getHorsepower();
                truckCount++;
            }
            command = scanner.nextLine();
        }
        String input = scanner.nextLine();

        while (!input.equals("Close the Catalogue")) {
            for (DataVehicle dataVehicle : carOrTruck) {
                if (dataVehicle.getModel().equals(input)) {
                    if (dataVehicle.getTypeOfVehicle().equals("car")) {
                        System.out.println("Type: Car");
                    }else {
                        System.out.println("Type: Truck");
                    }
                    System.out.printf("Model: %s%n", dataVehicle.getModel());
                    System.out.printf("Color: %s%n", dataVehicle.getColor());
                    System.out.printf("Horsepower: %s%n", dataVehicle.getHorsepower());
                }
            }
            input = scanner.nextLine();
        }
        if (carSum == 0) {
            System.out.println("Cars have average horsepower of: 0.00.");
        }else {
            System.out.printf("Cars have average horsepower of: %.2f.%n", carSum / carCount);
        }
        if (truckSum == 0) {
            System.out.println("Trucks have average horsepower of: 0.00.");
        }else {
            System.out.printf("Trucks have average horsepower of: %.2f.", truckSum / truckCount);
        }
    }

    public static class DataVehicle {
        private String typeOfVehicle;
        private String model;
        private String color;
        private int horsepower;

        public DataVehicle(String typeOfVehicle, String model, String color, int horsepower) {
            this.typeOfVehicle = typeOfVehicle;
            this.model = model;
            this.color = color;
            this.horsepower = horsepower;
        }

        public String getTypeOfVehicle() {
            return typeOfVehicle;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsepower() {
            return horsepower;
        }
    }
}
