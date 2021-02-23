package ax.ha.it.mortage;

public class Calculator {
    private double totalLoan;
    private double interest;
    private double years;

    public Calculator(double totalLoan, double interest, double years) {
        this.totalLoan = totalLoan;
        this.interest = interest;
        this.years = years;
    }

    public double calculateFormula(){
        double b = interest/12;
        double p = years*12;
        double bToThePowerOfp = 1+b;

        for(int i = 0; i < p; i++){
            bToThePowerOfp = bToThePowerOfp*(1+b);
        }

        return (totalLoan*(b*bToThePowerOfp))/(bToThePowerOfp-1);
    }

}
