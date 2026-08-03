package MasteringMoreJavaTypesAndArrays.Challenge1;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions) {
    public Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }
}

public class BankingChallenge {
    static void main(String[] args) {
        Customer customer = new Customer("Bob", 1000);
        System.out.println(customer);

        Bank bank = new Bank("Chase");
        bank.addCustomer(customer.name(), 1000);
        bank.addCustomer("Jane", 500);
        System.out.println(bank);

        bank.addTransaction("Jane", -10.25);
        bank.addTransaction("jane", -75.01);
        bank.printStatement("jane");
    }
}

class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customers=" + customers +
                '}';
    }

    private Customer getCustomer(String customerName) {
        for(var c : customers) {
            if(c.name().equalsIgnoreCase(customerName)) {
                return c;
            }
        }

        System.out.printf("Customer %s wasn't found \n", customerName);
        return null;
    }

    public void addCustomer (String customerName, double initialDeposit) {
        if(getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("Added new customer: " + customer);
        }
    }

    public void addTransaction(String name, double amount) {
        Customer customer = getCustomer(name);
        if(customer != null) {
            customer.transactions().add(amount);
        }
    }

    public void printStatement(String name) {
        Customer customer = getCustomer(name);
        if (customer == null) {
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer Name: " + customer.name());
        System.out.println("Transactions:");
        for (double tr : customer.transactions()) {
            System.out.printf("%10.2f (%s)\n", tr, tr < 0 ? "debit" : "credit");
        }
    }
}
