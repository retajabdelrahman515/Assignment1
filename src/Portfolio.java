import java.util.ArrayList;


 // Portfolio class stores and manages all investments
  //It uses an ArrayList of Investment objects so it can store
  //different investment types 
 
public class Portfolio {

    // Stores all investments in the portfolio
    private ArrayList<Investment> investments;

    // Constructor
    public Portfolio() {
        investments = new ArrayList<>(); //create actual arraylist
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

   //search for an investment using its symbol
    public Investment findInvestment(String symbol) {

    if (symbol == null) {
        return null; //no investment was found
    }

    for (Investment investment : investments) { //for every investment

        if (investment.getSymbol() != null //Make sure the current investment has a symbol
                && investment.getSymbol().equalsIgnoreCase(symbol)) { //and that symbol matches the searched symbol
            return investment;
        }
    }

    return null; //No matching investment was found
}

   // this method remove the investment using its symbol
    public boolean removeInvestment(String symbol) {

        Investment investment = findInvestment(symbol); //reuse findinvestment method to chech whether an investment was found

        if (investment != null) { //if the object exist, remove it from the arraylist
            investments.remove(investment); 
            return true;
        }

        return false; //the investment was nof found
    }

    
    public double calculateTotalValue() {

        double totalValue = 0; //creates a variable and starts from zero

        for (Investment investment : investments) {
             //get the current value of each investment and adds it to the total
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
            System.out.println("-----------------------------");
        }
    }

    // Returns the list of investments
    public ArrayList<Investment> getInvestments() {
        return investments;
    }

    // return how many investments currently stored in the portfolio
    public int getNumberOfInvestments() {
        return investments.size(); //returns the number of objects in the ArrayList
    }
}