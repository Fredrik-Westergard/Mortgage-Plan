package ax.ha.it.mortage;

public class Calculator {
    private double totalLoan;
    private double interest;
    private int years;

    public Calculator(double totalLoan, double interest, int years) {
        this.totalLoan = totalLoan;
        this.interest = interest;
        this.years = years;
    }

    public double toThePowerOf(double a, int b){
        double temp = 1;
        int b2;
        if(b != 0){
            if(b > 0){
                b2 = b;
            }
            else{
                b2 = b*-1;
            }
            for(int i = 0; i < b2; i++){
                temp *= a;
            }

            if(b < 0){
                temp = 1.0/a;
            }
        }
        else{
            return 1;
        }
        return temp;
    }

    public double calculateFormula(){
        int p = 12*years;
        double b = interest/(100+12);
        return (totalLoan*(b*toThePowerOf((1+b),p)))/toThePowerOf((1+b),p-1);
    }


}
