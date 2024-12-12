package banktask;

public class Bank {

    public static void increaseAmount(String identificationNumber, double amount) {
        for (int i = 0; i < Accounts.customerCount; i++) {
            if (Accounts.customers[i].getIdentificationNumber().equals(identificationNumber)) {
                double deposit = Accounts.customers[i].getDeposit();
                deposit = deposit + amount;
                Accounts.customers[i].setDeposit(deposit);
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Your balance increased successfully!");
        System.out.println("---------------------------------------");
    }

    public static void getAllCustomerInformation(String identificationNumber) {
        for (int i = 0; i < Accounts.customerCount; i++) {
            if (Accounts.customers[i].getIdentificationNumber().equals(identificationNumber)) {
                System.out.println("---------------------------------------");
                System.out.println("Name: "+ Accounts.customers[i].getName());
                System.out.println("Surname: "+ Accounts.customers[i].getSurname());
                System.out.println("Deposit: "+ Accounts.customers[i].getDeposit());
                System.out.println("Identification Number: "+ Accounts.customers[i].getIdentificationNumber());
                System.out.println("---------------------------------------");
            }
        }
    }

    public static void sendMoney(String number1, String number2, double amount) {
        for (int i = 0; i < Accounts.customerCount; i++) {
            if (Accounts.customers[i].getIdentificationNumber().equals(number1)) {
                double deposit = Accounts.customers[i].getDeposit();
                deposit = deposit - amount;
                Accounts.customers[i].setDeposit(deposit);
                for (int j = 0; j < Accounts.customerCount; j++) {
                    if (Accounts.customers[j].getIdentificationNumber().equals(number2)) {
                        deposit = Accounts.customers[j].getDeposit();
                        deposit = deposit + amount;
                        Accounts.customers[j].setDeposit(deposit);
                    }
                }
            }
        }
        System.out.println("---------------------------------------");
        System.out.println("Your money sent successfully!");
        System.out.println("---------------------------------------");
    }

    public static double getTotalDeposit() {
        double totalDeposit = 0;
        for (int i = 0; i < Accounts.customerCount; i++) {
            totalDeposit = totalDeposit + Accounts.customers[i].getDeposit();
        }
        return totalDeposit;
    }
}