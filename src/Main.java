import memento.Editor;
import memento.History;
import singleton.Car;
import state.BrushTool;
import state.Canvas;
import state.EraserTool;
import state.SelectionTool;

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

        // singleton pattern
        var car1 = Car.getCar("Nissan", "Skyline R34");
        System.out.println("Car: " + car1.name + " || Model: " + car1.model + ".");

        // memento pattern example
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent());

        // state pattern example
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
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