public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double accountBalance;
    private String accountType;

    BankAccount(String accountHolder, String accountNumber, double accountBalance, String accountType) {
        this.accountHolder  = accountHolder;
        this.accountNumber  = accountNumber;
        this.accountBalance = accountBalance;
        this.accountType    = accountType;
    }

    public String getAccountHolder()  { return this.accountHolder;  }
    public String getAccountNumber()  { return this.accountNumber;  }
    public double getAccountBalance() { return this.accountBalance; }
    public String getAccountType()    { return this.accountType;    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("REJECTED: Deposit amount must be greater than zero.");
            return;
        }
        this.accountBalance += amount;
        System.out.println("Deposited        : $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("REJECTED: Withdrawal amount must be greater than zero.");
            return;
        }
        if (amount > this.accountBalance) {
            System.out.println("REJECTED: Insufficient balance.");
            return;
        }
        this.accountBalance -= amount;
        System.out.println("Withdrawn        : $" + amount);
    }

    public void displayAccount() {
        System.out.println("Account Holder   : " + this.accountHolder);
        System.out.println("Account Number   : " + this.accountNumber);
        System.out.println("Account Type     : " + this.accountType);
        System.out.println("Account Balance  : $" + this.accountBalance);
        System.out.println("----------------------------");
    }
}