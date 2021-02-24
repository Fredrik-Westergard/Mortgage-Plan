package ax.ha.it.mortgage;

/**
 * calculator class for calculating the mortgage formula
 * @author Fredrik Westergård
 */
public class Calculator {
    private double totalLoan;   //the total loan
    private double interest;    //the interest
    private int years;          //the number of years

    /**
     * calculator constructor
     * @param totalLoan the total loan in Money format
     * @param interest the interest
     * @param years the number of years
     */
    public Calculator(Money totalLoan, double interest, int years) {
        this.totalLoan = totalLoan.getMoney();
        this.interest = interest;
        this.years = years;
    }

    /**
     * to the power of method
     * @param a the base
     * @param b the exponent
     * @return a to the power of b
     */
    public double toThePowerOf(double a, int b){
        double base = 1;    //set temp base to 1
        int exponent;             //create temp exponent
        if(b != 0){         //if b is 0 return 1
            if(b > 0){      //if b is a positive number set exponent as b
                exponent = b;
            }
            else{
                exponent = b*-1;  //else make b positive and set exponent to that number
            }
            for(int i = 0; i < exponent; i++){ //do a*a exponent times
                base *= a;
            }

            if(b < 0){      //if b was negative invert it
                base = 1.0/a;
            }
        }
        else{
            return 1;
        }
        return base;        //return the base as the result
    }

    /**
     * method to calculate formula
     * @return the result of the formula calculated and in Money format
     */
    public double calculateFormula(){
        int p = 12*years;               //p = the number of payments
        double b = ((interest/100)/12);   //b = the interest on a monthly basis
        return ((totalLoan*b)/(1-toThePowerOf((1+b),-p)))/p;    //the formula
    }
}
