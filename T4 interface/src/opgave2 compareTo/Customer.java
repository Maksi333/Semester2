package opgave2;

public class Customer implements Comparable<Customer>{
    private String firstName;
    private String lastName;
    private int age;


    public Customer(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    @Override
    public int compareTo(Customer o) {
        int lastNameCompare = this.lastName.compareTo(o.lastName);
        int firstNameCompare = this.firstName.compareTo(o.lastName);

        if(lastNameCompare != 0){
            return lastNameCompare;
        } else if(lastNameCompare != 0){
            return firstNameCompare;
        }else{
            return Integer.compare(this.age, o.age);
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
