package Account;

public class Checking extends Account{
    private double balance = 0;

    public Checking(){}
    
    public Checking(double balance) {
        this.balance = balance;
    }

    // Caso o programa evolua com uma opção de criar conta - Conta corrente.
    public Checking(String name, String lastName, int numberAccount, int pin, double balance) {
        super(name, lastName, numberAccount, pin);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    
}
