package Account;

public class Account {
    
    private String firstName,lastName;
    private int numberAccount;
    private int pin;
    
    public Account() {}

    public Account(String firstName, String lastName, int numberAccount, int pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberAccount = numberAccount;
        this.pin = pin;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
 
    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    
}
