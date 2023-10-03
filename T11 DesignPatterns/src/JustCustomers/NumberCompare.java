package JustCustomers;

import java.util.Comparator;

public abstract class NumberCompare implements Comparator<Customer> {


    @Override
    public int compare(Customer o1, Customer o2) {
        return Integer.compare(o1.getNumber(),o2.getNumber());
    }
}
