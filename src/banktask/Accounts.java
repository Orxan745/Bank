package banktask;

public class Accounts {

    public static Customer[] customers = new Customer[10];

    public static int customerCount = 0;

    public static void createNewAccount(Customer customer) {
       int percentage = (customerCount / customers.length) * 100;
       if (percentage >= 80) {
           Customer[] customers1 = new Customer[customers.length*2];
           for (int i = 0; i < customerCount; i++) {
               customers1[i] = customers[i];
           }
           customers = customers1;
       }
       customers[customerCount++] = customer;
       String a = Customer.randomIdentityCode();
       customer.setIdentificationNumber(a);
        System.out.println("---------------------------------------");
        System.out.println("Account created successfully!");
        System.out.println("Your identification number is: "+customer.getIdentificationNumber());
        System.out.println("---------------------------------------");
    }
}
