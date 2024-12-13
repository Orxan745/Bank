package banktaskv2;

public class Customer {
    private String name;

    private String surname;

    private String identificationNo;

    private Account[] accounts = new Account[10];

    private int accountsCount = 0;

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdentificationNo() {
        return identificationNo;
    }

    public void setIdentificationNo(String identificationNo) {
        this.identificationNo = identificationNo;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public int getAccountsCount() {
        return accountsCount;
    }

    public void setAccountsCount(int accountsCount) {
        this.accountsCount = accountsCount;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+"\n" +
                "Surname: "+this.surname+"\n" +
                "Accounts: "+this.accountsCount;
    }
}