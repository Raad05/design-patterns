public class MailService {
    // abstraction
    public void sendMail() {
        connect();
        authenticate();
        disconnect();
        System.out.println("Mail sent!");
    }

    private void connect() {
        System.out.println("Connected.");
    }

    private void authenticate() {
        System.out.println("Authenticated.");
    }

    private void disconnect() {
        System.out.println("Disconnected.");
    }
}
