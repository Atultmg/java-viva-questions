public class ShipmentGateway {

    static boolean isValidWeight(double weight) {
        return weight > 0 && weight <= 50;
    }

    static double calculateShippingFee(double weight) {

        if (!isValidWeight(weight)) {
            System.out.println("REJECTED: Invalid weight -> " + weight + "kg");
            return -1;
        }

        double fee;

        if (weight > 0 && weight <= 5) {
            fee = 5.00;
        } else if (weight > 5 && weight <= 15) {
            fee = 10.00;
        } else if (weight > 15 && weight <= 30) {
            fee = 20.00;
        } else {
            fee = 35.00;
        }

        System.out.println("ACCEPTED: " + weight + "kg -> Fee: $" + fee);
        return fee;
    }

    public static void main(String[] args) {

        calculateShippingFee(3.5);
        calculateShippingFee(12.0);
        calculateShippingFee(25.0);
        calculateShippingFee(45.0);
        calculateShippingFee(-5.0);
        calculateShippingFee(0);
        calculateShippingFee(99.0);
    }
}