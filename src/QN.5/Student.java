public class Student {

    String name;
    int testScore1;
    int testScore2;
    int testScore3;
    String status;

    Student(String name, int testScore1, int testScore2, int testScore3) {
        this.name = name;
        this.testScore1 = testScore1;
        this.testScore2 = testScore2;
        this.testScore3 = testScore3;
    }

    double calculateAverage() {
        return (testScore1 + testScore2 + testScore3) / 3.0;
    }

    void determineStatus() {
        double average = calculateAverage();
        if (average >= 80) {
            status = "PASS - Distinction";
        } else if (average >= 60) {
            status = "PASS";
        } else {
            status = "FAIL";
        }
    }

    void displayProfile() {
        System.out.println("Name    : " + name);
        System.out.println("Scores  : " + testScore1 + ", " + testScore2 + ", " + testScore3);
        System.out.println("Average : " + calculateAverage());
        System.out.println("Status  : " + status);
        System.out.println("----------------------------");
    }
}