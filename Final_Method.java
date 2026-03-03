public class Final_Method{

    public final void showMessage() {
        System.out.println("This method cannot be overridden.");
    }

    public static void main(String[] args) {
        Final_Method obj = new Final_Method();
        obj.showMessage();
    }
}