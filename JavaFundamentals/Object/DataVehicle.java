package JavaFundamentals2021.ObjectExersice2506;

public class DataVehicle {
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
