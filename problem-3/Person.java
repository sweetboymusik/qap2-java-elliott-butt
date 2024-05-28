public class Person {
    // instance fields
    private String lastName;
    private String firstName;
    private Address home;

    // constructors
    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // methods
    public String toString() {
        return String.format("%s %s, %s", this.firstName, this.lastName, this.home.toString());
    }
}
