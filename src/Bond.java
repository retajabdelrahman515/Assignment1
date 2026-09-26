import java.time.LocalDate;

public class Bond extends Investment {

    private double interestRate; //interest percentage paid by the bond
    private LocalDate maturityDate;
    private double faceValue; //the nominal value of the bond
// constructor
    public Bond(String symbol, String name, double quantity,  double purchasePrice, double currentPrice,  LocalDate purchaseDate, String riskLevel, double interestRate, LocalDate maturityDate,double faceValue) {

        super(symbol, name, quantity, purchasePrice,currentPrice, purchaseDate, riskLevel, "Bond");

        this.interestRate = interestRate;
        this.maturityDate = maturityDate;
        this.faceValue = faceValue;
    }
//get& set for bond Attributes
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    public double getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(double faceValue) {
        this.faceValue = faceValue;
    }

    @Override
    public String getDetails() {
        return "Bond: " + getName()+ ", Symbol: " + getSymbol()+ ", Interest Rate: " + interestRate + "%"+ ", Maturity Date: " + maturityDate    + ", Face Value: " + faceValue;
    }
}
