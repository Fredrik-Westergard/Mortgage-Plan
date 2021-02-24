package ax.ha.it.mortgage;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CalculatorTest extends TestCase {

    private ReadFromFile readfromfile = new ReadFromFile();
    private List<Prospects> list = readfromfile.readFile();

    @Test
    public void testCalculateFormula(){
        Money totalLoan = list.get(0).getTotalLoan();
        Money interest = list.get(0).getInterest();
        int years = list.get(0).getYears();
        Calculator calc = new Calculator(totalLoan, interest,years);
        assertEquals(calc.calculateFormula(), 46.63584183673469);
    }

    @Test
    public void testToThePowerOf(){
        Calculator calc = new Calculator(new Money(0),new Money(0),0);
        assertEquals(calc.toThePowerOf(5.5,5), 5032.84375);
    }

}
