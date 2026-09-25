import java.time.LocalDate;

public class MutualFund extends Investment {

    private String fundManager;
    private double expenseRatio; //% charged for managing the fund
//constructor
    public MutualFund(String symbol, String name, double quantity,double purchasePrice, double currentPrice, LocalDate purchaseDate, String riskLevel,         String fundManager, double expenseRatio) {

        super(symbol, name, quantity, purchasePrice,  currentPrice, purchaseDate, riskLevel, "Mutual Fund");

        this.fundManager = fundManager;
        this.expenseRatio = expenseRatio;
    }
 //get&set for the specific attributes
    public String getFundManager() {
        return fundManager;
    }

    public void setFundManager(String fundManager) {
        this.fundManager = fundManager;
    }

    public double getExpenseRatio() {
        return expenseRatio;
    }

    public void setExpenseRatio(double expenseRatio) {
        this.expenseRatio = expenseRatio;
    }

    @Override
    public String getDetails() {
        return "Mutual Fund: " + getName()
                + ", Symbol: " + getSymbol()
                + ", Fund Manager: " + fundManager
                + ", Expense Ratio: " + expenseRatio + "%";
    }
}