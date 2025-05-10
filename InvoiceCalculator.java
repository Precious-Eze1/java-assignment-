public class InvoiceCalculator {
    private double addTax(double amount, double rate) {
        return amount + (amount * rate);
    }
    public double calcTotalWithTax(double amount) {
        return addTax(amount, 0.08);
    }
}