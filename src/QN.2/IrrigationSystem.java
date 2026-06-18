// Irrigation System
public class IrrigationSystem {
    public static void main(String[] args) {
        double[] moistureLogs = {42.0, 47.5, 39.8, 50.2, 44.1, 38.6, 46.3};
        double baseline = 45.0;
        double totalVariance = 0.0;

        for (int i = 0; i < moistureLogs.length; i++) {
            totalVariance += moistureLogs[i] - baseline;
        }

        String decisionCode;
        if (totalVariance < -10) {
            decisionCode = "IRRIGATE";
        } else if (totalVariance > 10) {
            decisionCode = "DRAIN";
        } else {
            decisionCode = "OPTIMAL";
        }

        System.out.println("Total Variance: " + totalVariance);
        System.out.println("Decision Code: " + decisionCode);
    }
}