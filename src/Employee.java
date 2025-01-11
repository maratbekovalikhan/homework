public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getPosition() {
        return "Employee";
    }

    @Override
    public double getPaymentAmount() {
        return salary;
    }

    @Override
    public String toString() {
        return getPosition() + ": " + super.toString();
    }
}