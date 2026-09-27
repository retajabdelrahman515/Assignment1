/*
    CSC301 Assignment 1
    Section: 105
    Group: 2
 
    Group Members:
        Retaj Abdelmagid - 1097212
        Lian Momed al hmed  - 1098452
        Mariam Hegge - 1098127
 */




public class InvestmentGoal {
   
    // Fields to store goal details
    private String description;
    private double targetAmount;

    // Constructor to initialize description and target amount
    public InvestmentGoal(String description, double targetAmount) {
        this.description = description;
        this.targetAmount = targetAmount;
    }

    public String getDescription() {
        return description;
    }

    public double getTargetAmount() {
        return targetAmount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTargetAmount(double targetAmount) {
        this.targetAmount = targetAmount;
    }

    
    // Calculate the remaining amount needed to reach the goal
    
    public double calculateDeficit(double currentPortfolioValue) {
        double deficit = targetAmount - currentPortfolioValue;
        // If deficit is positive, return it; otherwise return 0 (goal reached)
        if (deficit > 0) {
            return deficit;
        } else {
            return 0.0;
        }
    }

    //Display the Goals acheived by the user
    public void displayGoalAnalysis(double currentPortfolioValue) {
        double progressPct = 0.0;
        
        // Prevent division by zero if target amount is not set
        if (targetAmount > 0) {
            progressPct = (currentPortfolioValue / targetAmount) * 100;
        }

        // Calculate short amount using calculateDeficit method
        double deficit = calculateDeficit(currentPortfolioValue);

        // Print goal details and current status
        System.out.println("\n--- Goal Analysis ---");
        System.out.println("Goal Description : " + description);
        System.out.printf("Target Amount    : $%.2f\n", targetAmount);
        System.out.printf("Portfolio Value  : $%.2f\n", currentPortfolioValue);
        System.out.printf("Progress         : %.2f%%\n", progressPct);
        System.out.printf("Remaining Deficit: $%.2f\n", deficit);
    }
}
