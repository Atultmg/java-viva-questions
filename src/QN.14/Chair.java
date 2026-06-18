public class Chair {

    public static void main(String[] args) {

        Appliance fan   = new SmartFan("Dyson",   3);
        Appliance light = new SmartLight("Philips", 80, "Warm White");
        Appliance ac    = new SmartAc("Samsung",  22);

        Appliance[] ecosystem = {fan, light, ac};

        System.out.println("=== TURNING ALL ON ===");
        for (Appliance a : ecosystem) {
            a.turnOn();
        }

        System.out.println("----------------------------");
        System.out.println("=== CURRENT STATUS ===");
        for (Appliance a : ecosystem) {
            a.displayStatus();
        }

        System.out.println("----------------------------");
        System.out.println("=== TURNING ALL OFF ===");
        for (Appliance a : ecosystem) {
            a.turnOff();
        }

        System.out.println("----------------------------");
        System.out.println("=== FINAL STATUS ===");
        for (Appliance a : ecosystem) {
            a.displayStatus();
        }
    }
}