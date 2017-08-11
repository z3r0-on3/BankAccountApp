package com.company;

import java.util.ArrayList;

public class Branch {

    private String name;
    private ArrayList<Customer> customers;

    public String getName() {
        return name;
    }

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){

            this.customers.add(new Customer(customerName, initialAmount));
            return true;

        }
        return false;
    }

    public boolean newCustomer(String customerName, double initialAmount){

        if(findCustomer(customerName) == null){

            this.customers.add(new Customer(customerName, initialAmount));
            return true;

        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount){

        Customer existingCustomer = findCustomer(customerName);
        if(existingCustomer != null){

            existingCustomer.addTransactions(amount);
            return true;

        }
        return false;

    }

    private Customer findCustomer(String customerName){

        for(int i=0 ; i<customers.size() ; i++){
            Customer checkedCustomers = this.customers.get(i);

            if(checkedCustomers.getName().equals(customerName)){

                return checkedCustomers;

            }
        }
        return null;
    }

}
