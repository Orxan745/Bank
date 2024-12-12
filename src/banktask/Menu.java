package banktask;

public class Menu {

    public static void getMenu() {
        System.out.println("---------------------------------------");
        System.out.println("1. Log in to an account \n"+
                "2. Create new account \n"+
                "3. Get total deposit \n"+
                "4. Exit");
        System.out.println("---------------------------------------");
    }

    public static void getAccountMenu() {
        System.out.println("---------------------------------------");
        System.out.println("1. See all account data \n"+
                "2. Increase deposit amount \n"+
                "3. Send money to other accounts \n"+
                "4. Exit");
        System.out.println("---------------------------------------");
    }
}
