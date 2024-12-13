package banktaskv2;

import java.util.Random;

import static banktaskv2.Bank.*;

public class BankUtil {
    public static void addNewCustomer(Customer customer) {
        int percentage = (customersCount / customers.length) * 100;
        if (percentage >= 80) {
            Customer[] customers1 = new Customer[customers.length*2];
            for (int i = 0; i < customersCount; i++) {
                customers1[i] = customers[i];
            }
            customers = customers1;
        }
        customer.setIdentificationNo(randomIdentificationNo());
        customers[customersCount++] = customer;
        System.out.println("---------------------------------------");
        System.out.println("Customer added successfully!");
        System.out.println("Your identification number is: "+customer.getIdentificationNo());
        System.out.println("---------------------------------------");
    }

    public static void addNewAccount(Customer customer, Account account) {
        int percentage = (customer.getAccountsCount() / customer.getAccounts().length) * 100;
        if (percentage >= 80) {
            Account[] accounts1 = new Account[customer.getAccounts().length*2];
            for (int i = 0; i < customer.getAccountsCount(); i++) {
                accounts1[i] = customer.getAccounts()[i];
            }
            customer.setAccounts(accounts1);
        }
        account.setAccountNumber(randomIdentificationNo());
        customer.getAccounts()[customer.getAccountsCount()] = account;
        customer.setAccountsCount(customer.getAccountsCount()+1);
        System.out.println("---------------------------------------");
        System.out.println("Account created successfully!");
        System.out.println("Your account number is: "+account.getAccountNumber());
        System.out.println("---------------------------------------");
    }

    public static void addDeposit(String identificationNo, String accountNo, Double deposit) {
        Customer customer = searchCustomer(identificationNo);
        Account account = searchAccount(customer,accountNo);
        account.setDeposit(account.getDeposit()+deposit);
    }

    public static void moneyTransfer(String identificationNoFrom, String identificationNoTo,
                                     String accountNoFrom, String accountNoTo, Double money) {
        Customer customerFrom = searchCustomer(identificationNoFrom);
        Customer customerTo = searchCustomer(identificationNoTo);
        Account accountFrom = searchAccount(customerFrom, accountNoFrom);
        Account accountTo = searchAccount(customerTo, accountNoTo);
        accountFrom.setDeposit(accountFrom.getDeposit()-money);
        accountTo.setDeposit(accountTo.getDeposit()+money);
    }

    public static Customer searchCustomer(String identificationNo) {
        for (int i = 0; i < customersCount; i++) {
            if (customers[i].getIdentificationNo().equals(identificationNo)) {
                return customers[i];
            }
        }
        throw new RuntimeException("Customer cannot found!");
    }

    public static Account searchAccount(Customer customer, String accountNo) {
        for (int i = 0; i < customer.getAccountsCount(); i++) {
            if (customer.getAccounts()[i].getAccountNumber().equals(accountNo)) {
                return customer.getAccounts()[i];
            }
        }
        throw new RuntimeException("Account cannot found!");
    }

    public static Double getTotalDeposit() {
        Double totalDeposit = 0D;
        for (int i = 0; i < customersCount; i++) {
            for (int j = 0; j < customers[i].getAccountsCount(); j++) {
                totalDeposit = totalDeposit + customers[i].getAccounts()[j].getDeposit();
            }
        }
        return totalDeposit;
    }

    public static String randomIdentificationNo() {
        Random random = new Random();
        int a;
        char b;
        String identificationNo = "";
        for (int i = 0; i < 7; i++) {
            a = random.nextInt(48, 57);
            b = (char) a;
            identificationNo = identificationNo + b;
        }
        return identificationNo;
    }
}