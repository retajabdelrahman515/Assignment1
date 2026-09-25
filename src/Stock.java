import java.time.LocalDate;

public class Stock extends Investment {

    // Attributes specific only to stocks
    private String exchange; 
    private double dividendPerShare;

    // Constructor
    public Stock(String symbol, String name, double quantity,  double purchasePrice, double currentPrice, LocalDate purchaseDate, String riskLevel,  String exchange, double dividendPerShare) {

        // Call the parent Investment constructor
        super(symbol, name, quantity, purchasePrice,currentPrice, purchaseDate, riskLevel, "Stock");

        this.exchange = exchange;
        this.dividendPerShare = dividendPerShare;
    }

    // Getter and setter for stock exchange
    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    // Getter and setter for dividend per share
    public double getDividendPerShare() {
        return dividendPerShare;
    }

    public void setDividendPerShare(double dividendPerShare) {
        this.dividendPerShare = dividendPerShare;
    }

    // Provides details specific to a Stock object
    @Override
    public String getDetails() {
        return "Stock: " + getName()   + ", Symbol: " + getSymbol()    + ", Exchange: " + exchange     + ", Dividend Per Share: " + dividendPerShare;
    }
}