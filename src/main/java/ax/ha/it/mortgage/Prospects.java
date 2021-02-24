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

    /**
     * Prospects constructor
     * @param customer the customer name
     * @param totalLoan the total loan
     * @param interest the interest
     * @param years the number of years
     */
    public Prospects(String customer, double totalLoan, double interest, int years){
        this.customer = customer;
        this.years = years;
        this.totalLoan = new Money(totalLoan);
        this.interest = new Money(interest);
    }

    /**
     * customer name getter
     * @return the customer name
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * total loan getter in Money format
     * @return the total loan
     */
    public Money getTotalLoan() {
        return totalLoan;
    }

    /**
     * interest getter in Money format
     * @return the interest
     */
    public Money getInterest() {
        return interest;
    }

    /**
     * getter of years
     * @return the number of years
     */
    public int getYears() {
        return years;
    }

    /**
     * to string override
     * @return a string containing all of the information in the Prospects object
     */
    @Override
    public String toString() {
        return  "customer='" + customer + '\'' +
                ", totalLoan=" + totalLoan.toString() +
                ", interest=" + interest.toString() +
                ", years=" + years;
    }
}
