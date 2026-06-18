public class ScienceDept extends Department {

    double labMaintenanceFee;

    ScienceDept(String deptName, double budget, double labMaintenanceFee) {
        super(deptName, budget);
        this.labMaintenanceFee = labMaintenanceFee;
    }

    @Override
    public void checkBudgetStatus() {
        double remainingBudget = budget - labMaintenanceFee;
        System.out.println("Department       : " + deptName);
        System.out.println("Total Budget     : $" + budget);
        System.out.println("Lab Maintenance  : $" + labMaintenanceFee);
        System.out.println("Remaining Budget : $" + remainingBudget);
        if (remainingBudget >= 50000) {
            System.out.println("Status           : SUFFICIENT");
        } else if (remainingBudget >= 20000) {
            System.out.println("Status           : MODERATE");
        } else {
            System.out.println("Status           : CRITICAL - Lab fees exceed safe threshold");
        }
    }
}