public class Manager extends Employee {

    Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    double calculatePay() {
        return salary + (salary * 0.20);
    }
}