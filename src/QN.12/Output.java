public class Output {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Atul",    "ACC-1001", 5000.00, "Savings");
        BankAccount acc2 = new BankAccount("Rhijesh", "ACC-1002", 8000.00, "Current");

        acc1.displayAccount();
        acc2.displayAccount();

        acc1.deposit(2000.00);
        acc1.withdraw(1500.00);
        acc1.withdraw(99999.00);
        acc1.deposit(-500.00);

        System.out.println("----------------------------");
        acc1.displayAccount();

        acc2.deposit(3000.00);
        acc2.withdraw(4000.00);

        System.out.println("----------------------------");
        acc2.displayAccount();
    }
}