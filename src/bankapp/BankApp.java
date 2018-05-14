package bankapp;

import java.util.Scanner;
import java.util.List;

public class BankApp {
    
    public static void main(String[] args) {
        Bank lloydsBank = new Bank();
        Scanner userInput = new Scanner(System.in);
        double total;

        lloydsBank.addCustomer(new Company());
        lloydsBank.addCustomer(new LargeCompany());
        lloydsBank.addCustomer(new Person());
        lloydsBank.addCustomer(new ImportantPerson());
        
        
        for(Customer customer : lloydsBank.getCustomers()) { //zapytac czy to jest poprawne takie dodawanie 
            for(int i = 0; i < (int) (Math.random() * 3) + 1; ++i) { //dodawanie od 1 do 3 kont dla kazdego typu klienta
                System.out.print("Podaj numer konta bankowego:");
                customer.addAccount(new Account(userInput.nextLine()));      
            }
            for(Account account : customer.getAccounts()) {  // dodawanie losowej kwoty do kazdego konta uzytkownika
                    account.deposit(Math.random() * 1000);
            }
        }
        
    //pokombinowac, ze dla kazdego wariantu jest oddzielna suma i zwinac to wszystko do jakiejs sprytnej petli
    total = 0;
    for(Customer customer : lloydsBank.getCustomers()) {
        
        if((customer.getClass() == Company.class) || (customer.getClass() == LargeCompany.class)) {
            for(Account account : customer.getAccounts()) {
                total += account.getBalance();
            }
        }
        
    }
    System.out.println("Laczna suma na kontach firm:" + total);
    total = 0;
    for(Customer customer : lloydsBank.getCustomers()) {
        
        if((customer.getClass() == Person.class) || (customer.getClass() == ImportantPerson.class)) {
            for(Account account : customer.getAccounts()) {
                total += account.getBalance();
            }
        }
       
    }
    System.out.println("Laczna suma na kontach osob fizycznych:" + total);  
    total = 0;
    for(Customer customer : lloydsBank.getCustomers()) {
        
        
        if((customer.getClass() == LargeCompany.class) || (customer.getClass() == ImportantPerson.class)) {
            for(Account account : customer.getAccounts()) {
                total += account.getBalance();
            }
        }
    }
    System.out.println("Laczna suma na kontach duzych firm i waznych osob:" + total);
    total = 0;  
    for(Customer customer : lloydsBank.getCustomers()) { 
        
        if((customer.getClass() == Person.class)) {
            for(Account account : customer.getAccounts()) {
                total += account.getBalance();
            }
        }
    }
    System.out.println("Laczna suma na kontach zwyklych osob:" + total);
        
        
    }
}
    
