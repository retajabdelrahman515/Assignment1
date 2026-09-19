import java.util.Scanner;
//Hiiiiiiii
//Engineer Layan was heree
public class PortfolioPro_MS {
	public static void main(String[] args) {
	
		int userChoice;
		do {
			DislayMenu();
			userChoice = UserMenuChoice();
			switch (userChoice) {
				case 1: AddInvestmentToPortfolio(); break; 	// 1-	Add a new investment to a portfolio. 
				case 2: UpdateInvestmentDetails(); break;	// 2-	Update investment details (quantity, purchase price, ...).
				case 3: SetUpdateInvestmentGoals(); break;	// 3-	Set or update investment goals.
				case 4: AddInvestmentsFromFile(); break;	// 4-	Bulk addition of investments from a file.
				case 5: ListAllInvestments(); break;		// 5-	List all investments in the portfolio of a selected customer and View progress toward investment goals.
				case 6: CalculatePortfolioValue(); break;   // 6-	Calculate the total portfolio value for a selected customer.
				case 7: ExtraFunctionality(); break;  		// 7-	Calculate the total portfolio value for a selected customer.

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
		System.out.println("7- ONE additional functionality of your choice. BE INNOVATIVE.");
		System.out.println("0- Quit");
		System.out.println("---------------------------------------------------------");
	}

	public static int UserMenuChoice(){
		Scanner input = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Your choice (0, 1, 2, 3, 4, 5, 6, 7, 8, ...):");
			choice = input.nextInt();
		} while(choice > 7);
		return choice;
	}
	
	public static void AddInvestmentToPortfolio(){
		// To be completed. Feel free to change the input parameters. 
	}

	public static void UpdateInvestmentDetails(){
		// To be completed. Feel free to change the input parameters.  
	}

	public static void SetUpdateInvestmentGoals(){
		// To be completed. Feel free to change the input parameters.  
	}

	public static void AddInvestmentsFromFile(){
	}

	public static void ListAllInvestments(){
		// To be completed. Feel free to change the input parameters. 
	}
	
	public static void CalculatePortfolioValue(){
		// To be completed. Feel free to change the input parameters. 
	}
	
	public static void ExtraFunctionality(){
		// To be completed. Feel free to change the input parameters. 
	}
}
