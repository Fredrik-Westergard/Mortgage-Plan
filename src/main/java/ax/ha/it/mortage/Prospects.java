package ax.ha.it.mortage;

public class Prospects {
    private String customer;
    private int totalLoan;
    private int interest;
    private int years;

    public Prospects(String customer, int totalLoan, int interest, int years){
        this.customer = customer;
        this.totalLoan = totalLoan;
        this.interest = interest;
        this.years = years;
    }

    public String getCustomer() {
        return customer;
    }

    public int getTotalLoan() {
        return totalLoan;
    }

    public int getInterest() {
        return interest;
    }

    public int getYears() {
        return years;
    }
}
