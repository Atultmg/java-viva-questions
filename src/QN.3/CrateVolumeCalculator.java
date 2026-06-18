// CrateVolumeCalculator
public class CrateVolumeCalculator {

    public static double calculateVolume(double side) {
        return side * side * side;
    }

    public static double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    public static void main(String[] args) {

        double cubeVolume = calculateVolume(5.0);
        System.out.println("Cubic box volume: " + cubeVolume);

        double containerVolume = calculateVolume(10.0, 4.0, 3.0);
        System.out.println("Container volume: " + containerVolume);
    }
}
