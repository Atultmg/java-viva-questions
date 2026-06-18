import java.util.ArrayList;

public class DriverRoster {

    public static void main(String[] args) {

        ArrayList<String> activeDrivers = new ArrayList<>();
        activeDrivers.add("D1 - Atul");
        activeDrivers.add("D2 - Rhijesh");
        activeDrivers.add("D3 - Dipu");
        activeDrivers.add("D4 - Krish");
        activeDrivers.add("D5 - Subina");

        System.out.println("Original Roster  : " + activeDrivers);

        // set() — overwrites index 1, Rhijesh is lost
        ArrayList<String> overwriteTest = new ArrayList<>(activeDrivers);
        overwriteTest.set(1, "D2 - PriorityDriver");
        System.out.println("After set()      : " + overwriteTest);

        // add(index, element) — inserts at index 1, shifts all right
        ArrayList<String> insertTest = new ArrayList<>(activeDrivers);
        insertTest.add(1, "PRIORITY - FastDriver");
        System.out.println("After add()      : " + insertTest);

        System.out.println("----------------------------");
        System.out.println("Roster size after set() : " + overwriteTest.size());
        System.out.println("Roster size after add() : " + insertTest.size());
    }
}