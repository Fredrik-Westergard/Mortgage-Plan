package ax.ha.it.mortgage;

import java.util.List;

public class Printer {
    private List<Prospects> prospects;

    public Printer(List<Prospects> prospects) {
        this.prospects = prospects;
    }

    @Override
    public String toString() {
        StringBuilder toPrint = new StringBuilder();
        int i = 1;
        for(Prospects p: prospects) {
            Money totalLoan = p.getTotalLoan();
            Money interest = p.getInterest();
            int years = p.getYears();
            Calculator calc = new Calculator(totalLoan, interest,years);
            Money monthly = calc.calculateFormula();
            toPrint.append("**************************************************************************************************************\n");
            toPrint.append("Prospect ");
            toPrint.append(i);
            toPrint.append(": ");
            toPrint.append(p.getCustomer());
            toPrint.append(" wants to borrow ");
            toPrint.append(totalLoan);
            toPrint.append("€ for a period of ");
            toPrint.append(years);
            toPrint.append(" years and pay ");
            toPrint.append(monthly.getMoney());
            toPrint.append(" each month.\n");
            i++;
        }
        toPrint.append("**************************************************************************************************************\n");

        return toPrint.toString();
    }
}
