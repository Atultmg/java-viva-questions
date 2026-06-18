public class ElectricTruck extends Vehicle {

    double batteryCapacity;
    int rangeKm;

    ElectricTruck(String brand, String model, int year, double price, double batteryCapacity, int rangeKm) {
        super(brand, model, year, price);
        this.batteryCapacity = batteryCapacity;
        this.rangeKm         = rangeKm;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Battery  : " + batteryCapacity + " kWh");
        System.out.println("Range    : " + rangeKm + " km");
    }
}