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

    // Calculates the remaining amount needed (deficit) to reach the goal
    public double calculateDeficit(double currentPortfolioValue) {
        double deficit = targetAmount - currentPortfolioValue;
        // If deficit is positive, return it; otherwise return 0 (goal reached)
        if (deficit > 0) {
            return deficit;
        } else {
            return 0.0;
        }
    }

    // Calculates progress percentage and displays goal analysis with alert messages
    public void displayGoalAnalysis(double currentPortfolioValue) {
        double progressPct = 0.0;
        
        // Prevent division by zero if target amount is not set
        if (targetAmount > 0) {
            progressPct = (currentPortfolioValue / targetAmount) * 100;
        }

        // Calculate short amount using calculateDeficit method
        double deficit = calculateDeficit(currentPortfolioValue);

        // Print goal details and current status
        System.out.println("\n--- Goal Deficit & Alert System ---");
        System.out.println("Goal Description : " + description);
        System.out.printf("Target Amount    : $%.2f\n", targetAmount);
        System.out.printf("Portfolio Value  : $%.2f\n", currentPortfolioValue);
        System.out.printf("Progress         : %.2f%%\n", progressPct);
        System.out.printf("Remaining Deficit: $%.2f\n", deficit);

        // Alert condition checks based on progress percentage
        if (progressPct >= 100.0) {
            System.out.println("Status:  Congratulations! You have fully achieved your financial goal!");
        } else if (progressPct >= 75.0) {
            System.out.println("Status: You are very close! You have achieved over 75% of your target.");
        } else if (progressPct < 50.0) {
            System.out.println("Status: Warning: You are under 50% of your target.");
            System.out.println("Advice: Consider increasing monthly savings or reviewing your asset allocation.");
        } else {
            System.out.println("Status: Steady progress towards your target!");
        }
        System.out.println("------------------------------------\n");
    }
}
