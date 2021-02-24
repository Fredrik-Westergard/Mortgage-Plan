package ax.ha.it.mortgage;

/**
 * Prospects class for storing mortgage information
 * @author Fredrik Westergård
 */
public class Prospects {
    private String customer;    //the customer name
    private Money totalLoan;   //the total loan amount
    private Money interest;    //the interest
    private int years;          //the number of years

    public Prospects(String customer, double totalLoan, double interest, int years){
        this.customer = customer;
        this.years = years;
        this.totalLoan = new Money(totalLoan);
        this.interest = new Money(interest);
    }

    public String getCustomer() {
        return customer;
    }

    public Money getTotalLoan() {
        return totalLoan;
    }

    public Money getInterest() {
        return interest;
    }

    public int getYears() {
        return years;
    }

    @Override
    public String toString() {
        return  "customer='" + customer + '\'' +
                ", totalLoan=" + totalLoan.toString() +
                ", interest=" + interest.toString() +
                ", years=" + years;
    }
}
