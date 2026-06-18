public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Atul", 85, 90, 88);
        Student s2 = new Student("Rhijesh", 55, 60, 50);
        Student s3 = new Student("Subina", 72, 68, 75);

        s1.determineStatus();
        s2.determineStatus();
        s3.determineStatus();

        s1.displayProfile();
        s2.displayProfile();
        s3.displayProfile();
    }
}