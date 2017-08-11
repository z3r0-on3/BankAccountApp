package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("World Bank");

        bank.addBranch("Mesapotamia");
        bank.addCustomer("Mesapotamia", "Paul", 500653.54);
        bank.addCustomer("Mesapotamia", "Jacob", 10298.23);
        bank.addCustomer("Mesapotamia", "Josef", 23421.12);

        bank.addBranch("Main");
        bank.addCustomer("Main", "Jake", 5002.04);
        bank.addCustomer("Main", "Meny", 56243.89);
        bank.addCustomer("Main", "Shirly", 65387.23);

        bank.listCustomers("Mesapotamia", true);
        System.out.println("----------------------------------------");
        bank.listCustomers("Main", true);

    }
}
