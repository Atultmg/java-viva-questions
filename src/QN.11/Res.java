public class Res {

    public static void main(String[] args) {

        ElectricTruck truck1 = new ElectricTruck("Tesla",   "Cybertruck", 2024, 79999.99, 200.0, 500);
        ElectricTruck truck2 = new ElectricTruck("Rivian",  "R1T",        2024, 69999.99, 180.0, 480);
        ElectricTruck truck3 = new ElectricTruck("Ford",    "F-150 Lightning", 2023, 55999.99, 150.0, 370);

        truck1.displayInfo();
        System.out.println("----------------------------");
        truck2.displayInfo();
        System.out.println("----------------------------");
        truck3.displayInfo();
    }
}