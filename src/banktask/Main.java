package banktask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu.getMenu();
            System.out.print("Please select an option: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> MenuUtil.logIn();
                case 2 -> MenuUtil.createNewAccount();
                case 3 -> MenuUtil.getTotalDeposit();
                case 4 -> System.exit(0);
            }
        }
    }
}
