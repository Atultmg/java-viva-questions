public class Consultant extends Employee {

    double bonusPercent;

    Consultant(String name, double salary, double bonusPercent) {
        super(name, salary);
        this.bonusPercent = bonusPercent;
    }

    @Override
    double calculatePay() {
        return salary + (salary * bonusPercent / 100);
    }
}