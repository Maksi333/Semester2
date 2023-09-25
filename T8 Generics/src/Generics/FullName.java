package Generics;


public class FullName implements Comparable<FullName>{

    private String firstName;
    private String lastName;


    public FullName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "FullName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(FullName n) {
        int compared = this.firstName.compareTo(n.getFirstName());
        if(compared == 0) compared = this.getFirstName().compareTo(n.getFirstName());
        return compared;
    }


}
