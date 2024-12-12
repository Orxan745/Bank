package banktask;

import java.util.Scanner;

public class MenuUtil {

    public static void logIn() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the identification number: ");
        String identificationNumber = scanner.next();
        while (true) {
            Menu.getAccountMenu();
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            if (option == 4) {
                break;
            }
            switch (option) {
                case 1 -> Bank.getAllCustomerInformation(identificationNumber);
                case 2 -> {
                    System.out.print("Please enter the amount you want to add to account: ");
                    double amount = scanner.nextDouble();
                    Bank.increaseAmount(identificationNumber, amount);
                }
                case 3 -> {
                    System.out.print("Please enter the account number you want to send money: ");
                    String identificationNumber2 = scanner.next();
                    System.out.println("Enter the amount you want to enter to another account: ");
                    double amount = scanner.nextDouble();
                    Bank.sendMoney(identificationNumber, identificationNumber2, amount);
                }
            }
        }
    }

    public static void createNewAccount() {
        System.out.println("---------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        Customer customer = new Customer(name, surname);
        Accounts.createNewAccount(customer);
        System.out.println("---------------------------------------");
    }

    public static void getTotalDeposit() {
        System.out.println("---------------------------------------");
        double totalDeposit = Bank.getTotalDeposit();
        System.out.println("Total deposit: "+totalDeposit);
        System.out.println("---------------------------------------");
    }
}
