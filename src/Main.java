public class Main {
    public static void main(String[] args) {
        // creating a User from a class
        var user = new User("Raad");
        user.greet();

        // interface example
        TaxCalculator calculator = getCalculator();
        System.out.println(calculator.calculateTax());

        // encapsulation example
        var account = new Account();
        account.deposit(10);
        account.withdraw(5);
        System.out.println(account.getBalance());
    }

    public static TaxCalculator getCalculator() {
        return new TaxCalculator2024();
    }
}