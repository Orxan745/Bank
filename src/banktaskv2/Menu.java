package banktaskv2;

public class Menu {
    public static void printMenu() {
        System.out.println("--------------------------------------------");
        String menu = "1. Add new customer\n" +
                "2. Create new account\n" +
                "3. Increase the deposit amount\n" +
                "4. Money transfer\n" +
                "5. Get total deposit\n" +
                "6. Search customers and accounts\n" +
                "7. Exit";
        System.out.println(menu);
        System.out.println("--------------------------------------------");
    }
}