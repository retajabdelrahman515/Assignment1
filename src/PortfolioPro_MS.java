import java.time.LocalDate;
import java.util.Scanner;
//Hiiiiiiii
//Engineer Layan was heree
public class PortfolioPro_MS {
	public static void main(String[] args) {
        
                
            Customer customer1 = new Customer(2, "Aya"); // Customer Aya has an ID: 2
            
            customer1.getPortfolio().addInvestment(
                new Stock(
                    "AAPL",
                    "Apple",
                    10,
                    150,
                    200,
                    LocalDate.of(2026, 1, 10),
                    "Medium",
                    "NASDAQ",
                    1.00
                )
            );

            customer1.getPortfolio().addInvestment(
                new Bond(
                    "B001",
                    "Government Bond",
                    5,
                    1000,
                    1050,
                    LocalDate.of(2026, 2, 15),
                    "Low",
                    5.0,
                    LocalDate.of(2030, 2, 15),
                    1000
                )
            );
            
		int userChoice;
		do {
			DislayMenu();
			userChoice = UserMenuChoice();
			switch (userChoice) {
				case 1: AddInvestmentToPortfolio(customer1); break; 	// 1-	Add a new investment to a portfolio. 
				case 2: UpdateInvestmentDetails(customer1); break;	// 2-	Update investment details (quantity, purchase price, ...).
				case 3: SetUpdateInvestmentGoals(customer1); break;	// 3-	Set or update investment goals.
				case 4: AddInvestmentsFromFile(customer1); break;	// 4-	Bulk addition of investments from a file.
				case 5: ListAllInvestments(customer1); break;		// 5-	List all investments in the portfolio of a selected customer and View progress toward investment goals.
				case 6: CalculatePortfolioValue(customer1); break;       // 6-	Calculate the total portfolio value for a selected customer.
				case 7: ExtraFunctionality(customer1); break;  		// 7-	Calculate the total portfolio value for a selected customer.

				default:  System.out.println("Thank you for using CSC301's Investment Portfolio Management System, Have a Good Bye.");
			}
		}while (userChoice != 0);
	}
	
	public static void DislayMenu() {
		System.out.println("---------------------------------------------------------");
		System.out.println("Investment Portfolio Management System (PortfolioPro, Fall 26-27)");
		System.out.println("---------------------------------------------------------");
		System.out.println("1- Add a new investment to a portfolio.");
		System.out.println("2- Update investment details (quantity, purchase price, ...).");
		System.out.println("3- Set or update investment goals.");
		System.out.println("4- Bulk addition of investments from a file.");
		System.out.println("5- List all investments in the portfolio of a selected customer and View progress toward investment goals.");
		System.out.println("6- Calculate the total portfolio value for a selected customer.");
		System.out.println("7- Portfolio Health Analyzer");
		System.out.println("0- Quit");
		System.out.println("---------------------------------------------------------");
	}

	public static int UserMenuChoice(){
		Scanner input = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Your choice (0, 1, 2, 3, 4, 5, 6, 7):");
			choice = input.nextInt();
		} while(choice > 7);
		return choice;
	}
	
	public static void AddInvestmentToPortfolio(Customer customer){

            Scanner input = new Scanner(System.in);
            
            System.out.println("\n Add Investment ");
            System.out.println("1- Stock");
            System.out.println("2- Bond");
            System.out.println("3- Mutual Fund");
            System.out.print("Choose investment type: ");
            int type = input.nextInt();
            input.nextLine();

            System.out.print("Symbol: ");
            String symbol = input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();

            System.out.print("Quantity: ");
            double quantity = input.nextDouble();

            System.out.print("Purchase price: ");
            double purchasePrice = input.nextDouble();

            System.out.print("Current price: ");
            double currentPrice = input.nextDouble();

            input.nextLine();

            System.out.print("Risk level: ");
            String riskLevel = input.nextLine();

            LocalDate purchaseDate = LocalDate.now();

            Investment investment = null;

            switch (type){
                case 1:

                System.out.print("Exchange: ");
                String exchange = input.nextLine();

                System.out.print("Dividend per share: ");
                double dividend = input.nextDouble();

                investment = new Stock(
                        symbol, name, quantity,
                        purchasePrice, currentPrice,
                        purchaseDate, riskLevel,
                        exchange, dividend
                );
                break;
                
                case 2:

                System.out.print("Interest rate: ");
                double interestRate = input.nextDouble();

                System.out.print("Maturity year: ");
                int year = input.nextInt();

                System.out.print("Maturity month: ");
                int month = input.nextInt();

                System.out.print("Maturity day: ");
                int day = input.nextInt();

                System.out.print("Face value: ");
                double faceValue = input.nextDouble();

                investment = new Bond(
                        symbol, name, quantity,
                        purchasePrice, currentPrice,
                        purchaseDate, riskLevel,
                        interestRate,
                        LocalDate.of(year, month, day),
                        faceValue
                );
                break;
                
                case 3:

                input.nextLine();

                System.out.print("Fund manager: ");
                String manager = input.nextLine();

                System.out.print("Expense ratio: ");
                double expenseRatio = input.nextDouble();

                investment = new MutualFund(
                        symbol, name, quantity,
                        purchasePrice, currentPrice,
                        purchaseDate, riskLevel,
                        manager, expenseRatio
                );
                break;

                default:
                System.out.println("Invalid investment type.");
                return;
            }

            if (customer.getPortfolio().addInvestment(investment)) {
                System.out.println("Investment added successfully.");
            } else {
                System.out.println("Investment could not be added. Symbol may already exist.");
            }
        }
	

	public static void UpdateInvestmentDetails(Customer customer) {

            Scanner input = new Scanner(System.in);

            System.out.println("\n--- Update Investment ---");

            System.out.print("Enter investment symbol: ");
            String symbol = input.nextLine();

            Investment investment =
                    customer.getPortfolio().findInvestment(symbol);

            if (investment == null) {
                System.out.println("Investment not found.");
                return;
            }

            System.out.println("Investment found: " + investment.getName());

            System.out.print("Enter new quantity: ");
            double quantity = input.nextDouble();

            System.out.print("Enter new purchase price: ");
            double purchasePrice = input.nextDouble();

            System.out.print("Enter new current price: ");
            double currentPrice = input.nextDouble();

            investment.setQuantity(quantity);
            investment.setPurchasePrice(purchasePrice);
            investment.setCurrentPrice(currentPrice);

            System.out.println("Investment updated successfully.");
        }

	public static void SetUpdateInvestmentGoals(Customer customer) {

            Scanner input = new Scanner(System.in);

            System.out.println("\n--- Set / Update Investment Goal ---");

            System.out.print("Enter goal description: ");
            String description = input.nextLine();

            System.out.print("Enter target amount: ");
            double targetAmount = input.nextDouble();

            InvestmentGoal goal =
                    new InvestmentGoal(description, targetAmount);

            customer.setInvestmentGoal(goal);

            System.out.println("Investment goal saved successfully.");
        }

	public static void AddInvestmentsFromFile(Customer customer){
	}

	public static void ListAllInvestments(Customer customer) {

            System.out.println("\n " + customer.getName()+ "'s Investments");

            customer.getPortfolio().displayAllInvestments();
        }
	
	public static void CalculatePortfolioValue(Customer customer){
            double totalValue = customer.getPortfolio().calculateTotalValue();

            System.out.println("\n----- Portfolio Value -----");

            System.out.println("Customer: " + customer.getName());

            System.out.printf(
                "Total Portfolio Value: $%.2f%n",
                totalValue
            );
        }
        
	public static void ExtraFunctionality(Customer customer) {

            Portfolio portfolio = customer.getPortfolio();

            // Check if portfolio is empty
            if (portfolio.getInvestments().isEmpty()) {
                System.out.println("Portfolio has no investments to analyze.");
                return;
            }

            double totalValue = 0;
            double totalInvested = 0;

            double stockValue = 0;
            double bondValue = 0;
            double mutualFundValue = 0;

            int lowRisk = 0;
            int mediumRisk = 0;
            int highRisk = 0;

            Investment bestInvestment = null;
            Investment worstInvestment = null;


            // Analyze all investments
            for (Investment investment : portfolio.getInvestments()) {

                double currentValue = investment.getCurrentValue();

                totalValue += currentValue;
                totalInvested += investment.getInvestmentAmount();


                // Find best and worst investment based on ROI
                if (bestInvestment == null ||
                        investment.getROI() > bestInvestment.getROI()) {

                    bestInvestment = investment;
                }

                if (worstInvestment == null ||
                        investment.getROI() < worstInvestment.getROI()) {

                    worstInvestment = investment;
                }


                // Calculate asset allocation
                if (investment.getAssetType().equalsIgnoreCase("Stock")) {

                    stockValue += currentValue;

                } else if (investment.getAssetType().equalsIgnoreCase("Bond")) {

                    bondValue += currentValue;

                } else if (investment.getAssetType().equalsIgnoreCase("Mutual Fund")) {

                    mutualFundValue += currentValue;
                }


                // Analyze risk levels
                if (investment.getRiskLevel().equalsIgnoreCase("Low")) {

                    lowRisk++;

                } else if (investment.getRiskLevel().equalsIgnoreCase("Medium")) {

                    mediumRisk++;

                } else if (investment.getRiskLevel().equalsIgnoreCase("High")) {

                    highRisk++;
                }
            }


            // Overall portfolio profit/loss
            double profitLoss = totalValue - totalInvested;

            double overallROI = 0;

            if (totalInvested > 0) {
                overallROI = (profitLoss / totalInvested) * 100;
            }


            // Asset allocation percentages
            double stockPercentage = (stockValue / totalValue) * 100;
            double bondPercentage = (bondValue / totalValue) * 100;
            double mutualFundPercentage = (mutualFundValue / totalValue) * 100;


            // Display results
            System.out.println("\n========== PORTFOLIO HEALTH ANALYSIS ==========");

            System.out.println("Customer: " + customer.getName());

            System.out.printf("Total Invested: $%.2f%n", totalInvested);
            System.out.printf("Current Value:  $%.2f%n", totalValue);
            System.out.printf("Profit/Loss:    $%.2f%n", profitLoss);
            System.out.printf("Overall ROI:    %.2f%%%n", overallROI);


            System.out.println("\n---------- PERFORMANCE ----------");

            System.out.println(
                    "Best Performer: " + bestInvestment.getName()
            );

            System.out.printf(
                    "ROI: %.2f%%%n",
                    bestInvestment.getROI()
            );

            System.out.println(
                    "Worst Performer: " + worstInvestment.getName()
            );

            System.out.printf(
                    "ROI: %.2f%%%n",
                    worstInvestment.getROI()
            );


            System.out.println("\n---------- ASSET ALLOCATION ----------");

            System.out.printf("Stocks:       %.2f%%%n", stockPercentage);
            System.out.printf("Bonds:        %.2f%%%n", bondPercentage);
            System.out.printf("Mutual Funds: %.2f%%%n", mutualFundPercentage);


            System.out.println("\n---------- RISK ANALYSIS ----------");

            System.out.println("Low Risk:    " + lowRisk);
            System.out.println("Medium Risk: " + mediumRisk);
            System.out.println("High Risk:   " + highRisk);


            System.out.println("\n---------- HEALTH WARNINGS ----------");

            if (stockPercentage > 70) {
                System.out.println(
                        "Warning: Portfolio is heavily concentrated in stocks."
                );
            }

            if (bondPercentage > 70) {
                System.out.println(
                        "Warning: Portfolio is heavily concentrated in bonds."
                );
            }

            if (mutualFundPercentage > 70) {
                System.out.println(
                        "Warning: Portfolio is heavily concentrated in mutual funds."
                );
            }

            if (highRisk > portfolio.getNumberOfInvestments() / 2) {
                System.out.println(
                        "Warning: More than half of the investments are high risk."
                );
            }

            if (stockValue == 0) {
                System.out.println("Warning: No stock investments.");
            }

            if (bondValue == 0) {
                System.out.println("Warning: No bond investments.");
            }

            if (mutualFundValue == 0) {
                System.out.println("Warning: No mutual fund investments.");
            }
        }
}
