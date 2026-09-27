/*
    CSC301 Assignment 1
    Section: 105
    Group: 2
 
    Group Members:
        Retaj Abdelmagid - 1097212
        Lian Momed al hmed  - 1098452
        Mariam Hegge - 1098127
 */


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