package banktaskv2;

import java.util.Scanner;
import static banktaskv2.BankUtil.*;

public class MenuUtil {

    public static void addCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the name: ");
        String name = scanner.next();
        System.out.print("Please enter the surname: ");
        String surname = scanner.next();
        Customer customer = new Customer(name,surname);
        addNewCustomer(customer);
    }

    public static void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the identification number: ");
        String identificationNo = scanner.next();
        Customer customer = searchCustomer(identificationNo);
        Account account = new Account();
        addNewAccount(customer, account);
    }

    public static void increaseDeposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the identification number: ");
        String identificationNo = scanner.next();
        System.out.print("Please enter the account number: ");
        String accountNo = scanner.next();
        System.out.print("Please enter the amount of deposit: ");
        Double deposit = scanner.nextDouble();
        addDeposit(identificationNo,accountNo,deposit);
        System.out.println("--------------------------------------------");
        System.out.println("Deposit added successfully!");
    }

    public static void transferMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the identification number of customer that sending money: ");
        String identificationNoFrom = scanner.next();
        System.out.print("Please enter the account number: ");
        String accountNoFrom = scanner.next();
        System.out.print("Please enter the identification number of customer that accepting money: ");
        String identificationNoTo = scanner.next();
        System.out.print("Please enter the account number: ");
        String accountNoTo = scanner.next();
        System.out.print("Please enter the amount of deposit: ");
        Double deposit = scanner.nextDouble();
        moneyTransfer(identificationNoFrom,identificationNoTo,accountNoFrom,accountNoTo,deposit);
        System.out.println("--------------------------------------------");
        System.out.println("Money transferred successfully!");
    }

    public static void seeTotalDeposit() {
        Double totalDeposit = getTotalDeposit();
        System.out.println("Total deposit: "+totalDeposit);
    }

    public static void searchCustomersAndAccounts() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the identification number: ");
        String identificationNo = scanner.next();
        Customer customer = searchCustomer(identificationNo);
        System.out.println(customer);
        if (customer.getAccountsCount() == 0) {
            throw new RuntimeException("This customer don't have an account!");
        }
        System.out.print("Please enter the account number: ");
        String accountNo = scanner.next();
        Account account = searchAccount(customer,accountNo);
        System.out.println(account);
    }
}
