import java.util.ArrayList;

public class BookStore {

    public static void main(String[] args) {

        ArrayList<String> catalog = new ArrayList<>();

        catalog.add("Clean Code         - Robert C. Martin  - $29.99");
        catalog.add("The Pragmatic      - Andrew Hunt        - $34.99");
        catalog.add("Design Patterns    - Gang of Four       - $45.99");
        catalog.add("Refactoring        - Martin Fowler      - $39.99");
        catalog.add("Head First Java    - Kathy Sierra       - $49.99");
        catalog.add("Effective Java     - Joshua Bloch       - $42.99");
        catalog.add("Java Concurrency   - Brian Goetz        - $55.99");

        System.out.println("=== FULL CATALOG ===");
        catalog.forEach(book -> System.out.println("  [BOOK] " + book));

        System.out.println("----------------------------");
        System.out.println("=== BOOKS UNDER $40 ===");
        catalog.forEach(book -> {
            double price = Double.parseDouble(book.split("\\$")[1]);
            if (price < 40.00) {
                System.out.println("  [DEAL] " + book);
            }
        });

        System.out.println("----------------------------");
        System.out.println("=== FORMATTED RECEIPT ===");
        final double[] total = {0};
        catalog.forEach(book -> {
            double price = Double.parseDouble(book.split("\\$")[1]);
            total[0] += price;
            System.out.println("  Charged: $" + price);
        });
        System.out.println("----------------------------");
        System.out.println("  Total   : $" + Math.round(total[0] * 100.0) / 100.0);
    }
}