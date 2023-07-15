package Account;

public class Savings extends Account{
    private double balance = 0;

    public Savings(){}

    public Savings(double balance) {
        this.balance = balance;
    }
    
    // Caso o programa evolua com uma opção de criar conta - Conta Poupança.
    public Savings(String name, String lastName, int numberAccount, int pin, double balance) {
        super(name, lastName, numberAccount, pin);
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    
}
