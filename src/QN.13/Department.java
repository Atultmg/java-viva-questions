public class Department {

    String deptName;
    double budget;

    Department(String deptName, double budget) {
        this.deptName = deptName;
        this.budget   = budget;
    }

    public void checkBudgetStatus() {
        System.out.println("Department       : " + deptName);
        System.out.println("Total Budget     : $" + budget);
        if (budget >= 50000) {
            System.out.println("Status           : SUFFICIENT");
        } else {
            System.out.println("Status           : LOW BUDGET");
        }
    }
}