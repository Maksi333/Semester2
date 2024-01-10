package Opgave1;

public class FullName implements Comparable<FullName> {
    private String firstName;
    private String lastName;

    public FullName (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(FullName o) {
        return this.firstName.compareTo(o.firstName);
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
