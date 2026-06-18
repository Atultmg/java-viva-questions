public class FinancialLedger {

    static double calculateCompoundInterest(double principal, double rate, int times, int years) {
        double amount = principal * Math.pow((1 + rate / times), times * years);
        return Math.round(amount * 100.0) / 100.0;
    }

    static double calculateSimpleInterest(double principal, double rate, int years) {
        double interest = principal * rate * years;
        return Math.round(interest * 100.0) / 100.0;
    }

    static double calculateTotalProfit(double principal, double rate, int times, int years) {
        double finalAmount = calculateCompoundInterest(principal, rate, times, years);
        return Math.round((finalAmount - principal) * 100.0) / 100.0;
    }

    public static void main(String[] args) {

        double principal = 10000.00;
        double rate      = 0.08;
        int times        = 12;
        int years        = 5;

        double compoundAmount  = calculateCompoundInterest(principal, rate, times, years);
        double simpleInterest  = calculateSimpleInterest(principal, rate, years);
        double totalProfit     = calculateTotalProfit(principal, rate, times, years);

        System.out.println("Principal         : $" + principal);
        System.out.println("Annual Rate       : " + (rate * 100) + "%");
        System.out.println("Compounded        : " + times + "x per year");
        System.out.println("Duration          : " + years + " years");
        System.out.println("----------------------------");
        System.out.println("Compound Amount   : $" + compoundAmount);
        System.out.println("Simple Interest   : $" + simpleInterest);
        System.out.println("Total Profit      : $" + totalProfit);
    }
}