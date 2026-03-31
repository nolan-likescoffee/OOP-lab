class InvoiceProcessor {
    public void generateInvoice(String customerName, double amount) {
        double finalAmount = calculateAmount(amount);
        System.out.println("Invoice for: " + customerName);
        System.out.println("Total Amount: " + finalAmount);
    }
    private double calculateAmount(double amount) {
        System.out.println("Superclass calculation (no discount applied)");
        return amount;
    }
}
class RetailInvoice extends InvoiceProcessor {
    @Override
    public void generateInvoice(String customerName, double amount) {
        double discountedAmount = applyDiscount(amount);
        System.out.println("Retail Invoice for: " + customerName);
        System.out.println("Discounted Amount: " + discountedAmount);
    }
    public double applyDiscount(double amount) {
        System.out.println("Applying retail discount of 10%");
        return amount * 0.9;
    }
}
public class BillingSystem {
    public static void main(String[] args) {
        InvoiceProcessor invoice;
        invoice = new RetailInvoice();
        invoice.generateInvoice("John Doe", 1000);
        System.out.println("\n--- Calling superclass version ---");
        invoice = new InvoiceProcessor();
        invoice.generateInvoice("Alice", 1000);
    }
}