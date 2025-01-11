public class Student extends Person {
    private double gpa;
    private static final double STIPEND = 36660.0;

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? STIPEND : 0.0;
    }

    @Override
    public String toString() {
        return getPosition() + ": " + super.toString();
    }
}
