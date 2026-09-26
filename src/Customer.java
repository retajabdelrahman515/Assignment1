public class Customer {

    private int customerID;
    private String name;
    private Portfolio portfolio;
    private InvestmentGoal investmentGoal;

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.portfolio = new Portfolio();
        this.investmentGoal = null;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public InvestmentGoal getInvestmentGoal() {
        return investmentGoal;
    }

    public void setInvestmentGoal(InvestmentGoal investmentGoal) {
        this.investmentGoal = investmentGoal;
    }
}