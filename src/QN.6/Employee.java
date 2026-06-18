public abstract class Employee {

    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double calculatePay();

    void displayPay() {
        System.out.println("Name   : " + name);
        System.out.println("Base   : $" + salary);
        System.out.println("Total  : $" + calculatePay());
        System.out.println("----------------------------");
    }
}