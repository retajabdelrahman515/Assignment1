public class Customer {

    private int id;
    private String name;
    private Portfolio portfolio;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.portfolio = new Portfolio();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }
}