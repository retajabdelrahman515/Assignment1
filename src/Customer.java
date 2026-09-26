
public class Customer {

    private int customerID;
    private String name;
    private Portfolio portfolio; // a customer has a portfolio
    //private InvestmentGoal investmentGoal; when mariam is done

    public Customer(int customerID, String name) {
        this.customerID = customerID;
        this.name = name;
        this.portfolio = new Portfolio();
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
    
    /*
    public InvestmentGoal getInvestmentGoal() {
        return investmentGoal;
    }

    public void setInvestmentGoal(InvestmentGoal investmentGoal) {
        this.investmentGoal = investmentGoal;
    }
    */
}