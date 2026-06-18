// GymHealthEvaluator
import java.util.Scanner;

public class GymHealthEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter body fat percentage: ");
        int bodyFat = scanner.nextInt();

        if (bodyFat < 14) {
            System.out.println("Athletic");
        } else if (bodyFat <= 24) {
            System.out.println("Fit");
        } else {
            System.out.println("Regular");
        }

        scanner.close();
    }
}