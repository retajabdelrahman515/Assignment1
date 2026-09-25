import java.util.ArrayList;

public class Portfolio {

    private ArrayList<Investment> investments;
    private InvestmentGoal goal;

    public Portfolio() {
        investments = new ArrayList<>();
    }

    public void addInvestment(Investment investment) {
        investments.add(investment);
    }

    public ArrayList<Investment> getInvestments() {
        return investments;
    }

    public void setGoal(InvestmentGoal goal) {
        this.goal = goal;
    }

    public InvestmentGoal getGoal() {
        return goal;
    }
}