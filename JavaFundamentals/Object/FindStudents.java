package JavaFundamentals2021.ObjectLAB2306;

public  class FindStudents {
    private String firstName;
    private String lastName;
    private int age;
    private String city;


    public FindStudents(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " is " + this.age + " years old ";
    }
}
