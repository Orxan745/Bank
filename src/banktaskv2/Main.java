package banktaskv2;

import java.util.Scanner;
import static banktaskv2.Menu.*;
import static banktaskv2.MenuUtil.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            System.out.print("Please select an option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> addCustomer();
                case 2 -> createAccount();
                case 3 -> increaseDeposit();
                case 4 -> transferMoney();
                case 5 -> seeTotalDeposit();
                case 6 -> searchCustomersAndAccounts();
                case 7 -> System.exit(0);
            }
        }
    }
}
