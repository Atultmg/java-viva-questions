public class TemperatureTracker {

    public static void main(String[] args) {

        double[] temperatures = {36.5, 42.1, 38.9, 55.3, 29.7, 61.2, 33.4, 48.6, 27.8, 53.0};

        double total = 0;
        double max = temperatures[0];

        for (int i = 0; i < temperatures.length; i++) {
            total += temperatures[i];
            if (temperatures[i] > max) {
                max = temperatures[i];
            }
        }

        double average = total / temperatures.length;

        System.out.println("Temperatures : ");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("  Day " + (i + 1) + " : " + temperatures[i] + "°C");
        }

        System.out.println("----------------------------");
        System.out.println("Average Temp : " + average + "°C");
        System.out.println("Highest Temp : " + max + "°C");
    }
}