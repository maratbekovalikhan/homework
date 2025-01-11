import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Payable> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", "Manager", 27045.78));
        people.add(new Student("Ringo", "Starr", 2.5));
        people.add(new Student("Paul", "McCartney", 3.5));
        people.add(new Employee("George", "Harrison", "Developer", 50000.0));

        Collections.sort(people, (a, b) -> Double.compare(a.getPaymentAmount(), b.getPaymentAmount()));

        printData(people);
    }

    public static void printData(Iterable<Payable> payables) {
        for (Payable p : payables) {
            String details = p instanceof Employee ? "Employee" : "Student";
            System.out.printf("%s: %s earns %.2f tenge%n", details, p, p.getPaymentAmount());
        }
    }
}