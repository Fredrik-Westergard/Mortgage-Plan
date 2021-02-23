package ax.ha.it.mortage;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CalculatorTest extends TestCase {

    private ReadFromFile readfromfile = new ReadFromFile();
    private List<Prospects> list = readfromfile.readFile();

    @Test
    public void calculateFormulaTest(){
        double totalLoan = list.get(0).getTotalLoan();
        double interest = list.get(0).getInterest();
        int years = list.get(0).getYears();
        Calculator calc = new Calculator(totalLoan, interest,years);
        assertEquals(calc.calculateFormula(), 46.63584183673469);
    }

    @Test
    public void toThePowerOfTest(){
        Calculator calc = new Calculator(0,0,0);
        assertEquals(calc.toThePowerOf(5.5,5), 5032.84375);
    }

}
