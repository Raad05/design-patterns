public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello, " + name);
    }
}
