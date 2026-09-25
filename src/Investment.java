public class Investment {

    private String name;
    private double quantity;
    private double currentPrice;

    public Investment(String name, double quantity, double currentPrice) {
        this.name = name;
        this.quantity = quantity;
        this.currentPrice = currentPrice;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }
}