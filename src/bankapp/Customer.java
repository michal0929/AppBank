package bankapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Class;
        
public class Customer {
    private List<Account> accounts = new ArrayList<>();

    public List<Account> getAccounts() {
        return accounts;
    }
    
    public void addAccount(Account newAccount) {
        accounts.add(newAccount);
    }
    
    
}
