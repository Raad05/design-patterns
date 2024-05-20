import memento.Editor;
import memento.History;

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

        // abstraction example
        var mailService = new MailService();
        mailService.sendMail();

        // inheritance example
        var textbox = new TextBox();
        textbox.enable();

        // polymorphism example
        var checkbox = new CheckBox();
        drawUIControl(checkbox);

        // memento pattern
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent());
    }

    // coupling example
    public static TaxCalculator getCalculator() {
        return new TaxCalculator2024();
    }

    // polymorphism example
    public static void drawUIControl(UIControl control) {
        control.draw();
    }
}