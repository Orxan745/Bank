package banktask;

import java.util.Random;

public class Customer {

    private String name;

    private String surname;

    private double deposit = 0;

    private String identificationNumber;

    public Customer(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public static String randomIdentityCode() {
        Random random = new Random();
        int a;
        char b;
        String identificationCode = "";
        for (int i = 0; i < 7; i++){
            a = random.nextInt(48,57);
            b = (char) a;
            identificationCode = identificationCode + b;
        }
        return identificationCode;
    }
}
