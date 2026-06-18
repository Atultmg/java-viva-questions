public class Output1 {

    public static void main(String[] args) {

        Department d1 = new Department("Arts",        60000.00);
        Department d2 = new Department("Commerce",    35000.00);

        Department d3 = new ScienceDept("Science",    80000.00, 25000.00);
        Department d4 = new ScienceDept("Biology",    40000.00, 35000.00);
        Department d5 = new ScienceDept("Chemistry",  90000.00, 15000.00);

        Department[] departments = {d1, d2, d3, d4, d5};

        for (Department d : departments) {
            d.checkBudgetStatus();
            System.out.println("----------------------------");
        }
    }
}