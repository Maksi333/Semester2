package JustCustomers;

import java.util.Comparator;

public class Customer {

    public int number;
    public String name;

    private static Comparator<Customer> customerComparator;

    public static Comparator<Customer> getCustomerComparator() {
        return customerComparator;
    }

    public static void setCustomerComparator(Comparator<Customer> customerComparator) {
        Customer.customerComparator = customerComparator;
    }

    public Customer(int number, String name){
        this.number = number;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int compareTo(Customer customer1, Customer customer2){
        return 0;
    }


}
