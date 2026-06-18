import java.util.ArrayList;

public class TheaterSeating {

    public static void main(String[] args) {

        ArrayList<String> seats = new ArrayList<>();
        seats.add("A1 - Atul");
        seats.add("A2 - Rhijesh");
        seats.add("A3 - Dipu");
        seats.add("A4 - Krish");
        seats.add("A5 - Subina");

        System.out.println("Original: " + seats);

        seats.remove(1);
        System.out.println("After cancel: " + seats);

        seats.add(1, "A2 - UpgradedUser");
        System.out.println("After upgrade: " + seats);

        seats.add("A6 - NewUser");
        System.out.println("After new booking: " + seats);
    }
}