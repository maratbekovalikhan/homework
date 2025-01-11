public abstract class Person implements Payable, Comparable<Person> {
    private static int counter = 0;
    private final int id;
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.id = ++counter;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract String getPosition();

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}