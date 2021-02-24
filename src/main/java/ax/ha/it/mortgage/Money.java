package ax.ha.it.mortgage;

/**
 * the Money class
 * @author Fredrik Westergård
 */
public class Money {
    private int euro; //the euro
    private int cent; //the cent

    /**
     * the Money constructor
     * @param money the money
     */
    public Money(double money) {
        this.euro = (int) money;

        //rounds cent to 2 digits,
        //not sure if I'm supposed to do this as there might be a loss or gain of 1 cent sometimes
        //I'm not very used to working with money, and I wasn't sure if I was allowed to ask the "customer"
        double temp = (money-euro)*100;
        int temp2 = (int) temp;
        int temp3 = (int) ((temp-temp2)*10);

        if(temp3 >= 5){
            temp2 += 1;
        }
        this.cent = temp2;
    }

    /**
     * getter of euro as an integer
     * @return the euro
     */
    public int getEuro() {
        return euro;
    }

    /**
     * getter of cent as an integer
     * @return the cent
     */
    public int getCent() {
        return cent;
    }

    /**
     * getter of money in double format
     * @return
     */
    public double getMoney(){
        return euro+((double)cent/100);
    }

    /**
     * toString override
     * @return euro and cent as a string
     */
    @Override
    public String toString() {
        return euro + "." + cent;
    }
}
