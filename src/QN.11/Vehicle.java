public class Vehicle {

    String brand;
    String model;
    int year;
    double price;

    Vehicle(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year  = year;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Brand    : " + brand);
        System.out.println("Model    : " + model);
        System.out.println("Year     : " + year);
        System.out.println("Price    : $" + price);
    }
}