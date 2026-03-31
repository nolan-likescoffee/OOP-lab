class Notifier {
    public void send(String message) {
        System.out.println("General Notification: " + message);
        logInternal(message); 
    }
    protected void send(String message, String email) {
        System.out.println("Email Notification to " + email + ": " + message);
    }
    void send(String message, long phoneNumber) {
        System.out.println("SMS to " + phoneNumber + ": " + message);
    }
    private void logInternal(String message) {
        System.out.println("[Internal Log]: " + message);
    }
}


class AppNotifier extends Notifier {
    public void testNotifications() {
        send("App update available");
        send("Check your email", "user@example.com");
        send("OTP Code", 9876543210L);
    }
}
public class Notification_System {
    public static void main(String[] args) {

        AppNotifier app = new AppNotifier();

        // Demonstrating method overloading
        app.send("Welcome Message");
        app.send("Email Alert", "admin@example.com");
        app.send("SMS Alert", 1234567890L);
        System.out.println("\n--- From Subclass Method ---");
        app.testNotifications();
    }
}