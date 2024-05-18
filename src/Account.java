public class Account {
    // encapsulation
    private float balance;

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }
}
