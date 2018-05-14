package bankapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {
    private List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer newCustomer) {
        customers.add(newCustomer);
    }
    
}
