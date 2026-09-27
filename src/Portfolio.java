/*
    CSC301 Assignment 1
    Section: 105
    Group: 2
 
    Group Members:
        Retaj Abdelmagid - 1097212
        Lian Momed al hmed  - 1098452
        Mariam Hegge - 1098127
 */


import java.util.ArrayList;

 // Portfolio class stores and manages all investments.
  //It uses an ArrayList of Investment objects so it can store
  //different investment types 
 
public class Portfolio {

    private ArrayList<Investment> investments; // Stores all investments in the portfolio

    // Constructor
    public Portfolio() {
        investments = new ArrayList<>();
    }

    
    public Investment findInvestment(String symbol) {

        if (symbol == null) {
            return null;
        }

        for (Investment investment : investments) {
            if (investment.getSymbol() != null && investment.getSymbol().equalsIgnoreCase(symbol)) {
                return investment;
            }
        }
        return null;
    }
 
    public boolean addInvestment(Investment investment) {

        if (investment == null) {
            return false;
        }

        // Prevent duplicate investment symbols
        if (findInvestment(investment.getSymbol()) != null) {
            return false;
        }

        investments.add(investment);
        return true;
    }

   
    public boolean removeInvestment(String symbol) {

        Investment investment = findInvestment(symbol);

        if (investment != null) {
            investments.remove(investment);
            return true;
        }

        return false;
    }

    
    public double calculateTotalValue() {

        double totalValue = 0;

        for (Investment investment : investments) {
            totalValue += investment.getCurrentValue();
        }

        return totalValue;
    }

   
    public void displayAllInvestments() {

        if (investments.isEmpty()) {
            System.out.println("The portfolio has no investments.");
            return;
        }

        for (Investment investment : investments) {
            System.out.println(investment.getDetails());
        }
    }

    // Returns the list of investments
    public ArrayList<Investment> getInvestments() {
        return investments;
    }

    // Returns the number of investments in the portfolio
    public int getNumberOfInvestments() {
        return investments.size();
    }
}