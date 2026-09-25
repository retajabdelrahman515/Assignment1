import java.time.LocalDate;

public abstract class Investment implements Reportable {

    // Common attributes shared by all investment types
    private String symbol; // to identify the investment
    private String name;
    private double quantity; //num. of units share by the customer
    private double purchasePrice; //paid for one unit 
    private double currentPrice; //current price of one unit
    private LocalDate purchaseDate;
    private String riskLevel;
    private String assetType; //type of the investment

   
     // Constructor 
     
    public Investment(String symbol, String name, double quantity,  double purchasePrice, double currentPrice,   LocalDate purchaseDate, String riskLevel,    String assetType) {

        this.symbol = symbol;
        this.name = name;
        this.quantity = quantity;
        this.purchasePrice = purchasePrice;
        this.currentPrice = currentPrice;
        this.purchaseDate = purchaseDate;
        this.riskLevel = riskLevel;
        this.assetType = assetType;
    }

    // Calculates the original amount invested
    public double getInvestmentAmount() {
        return quantity * purchasePrice;
    }

    // Calculates the current market value of the investment
    public double getCurrentValue() {
        return quantity * currentPrice;
    }

    // Calculates the Return On Investment (ROI) percentage(loss or profit)
    public double getROI() {

        double investmentAmount = getInvestmentAmount();

        // check if the investment amount is zero,to prevent division by 0 
        if (investmentAmount == 0) {
            return 0;
        }

        return ((getCurrentValue() - investmentAmount)
                / investmentAmount) * 100;
    }

    // Getters
    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public String getAssetType() {
        return assetType;
    }

    // Setters used when updating investment details
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    
     // Abstract method
     // Every child class must provide its own implementation
    @Override
    public abstract String getDetails();
}