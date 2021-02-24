package ax.ha.it.mortgage;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * test for Calculator
 * @author Fredrik Westergård
 */
public class CalculatorTest extends TestCase {

    private ReadFromFile readfromfile = new ReadFromFile(); //read from file object
    private List<Prospects> list = readfromfile.readFile(); //list of prospects

    /**
     * test to check if calculator outputs the right number
     */
    @Test
    public void testCalculateFormula(){
        Money totalLoan = list.get(0).getTotalLoan();
        double interest = list.get(0).getInterest();
        int years = list.get(0).getYears();
        Calculator calc = new Calculator(totalLoan, interest,years);
        assertEquals(calc.calculateFormula(), 41.84027777777793);
    }

    /**
     * test to check if toThePowerOf outputs correct numbers
     */
    @Test
    public void testToThePowerOf(){
        Calculator calc = new Calculator(new Money(0),0,0);
        assertEquals(calc.toThePowerOf(5.5,5), 5032.84375);
    }

}
