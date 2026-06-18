public class Result {

    public static void main(String[] args) {

        Manager m1      = new Manager("Atul", 5000);
        Consultant c1   = new Consultant("Rhijesh", 4000, 15);
        Consultant c2   = new Consultant("Dipu", 3500, 10);

        m1.displayPay();
        c1.displayPay();
        c2.displayPay();
    }
}