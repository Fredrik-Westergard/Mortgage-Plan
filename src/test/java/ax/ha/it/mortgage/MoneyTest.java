package ax.ha.it.mortgage;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

/**
 * Money test using JUnit
 * @author Fredrik Westergård
 */
public class MoneyTest extends TestCase {

    /**
     * test if it rounds to 3.56 from 3.555
     */
    @Test
    public void testRound(){
        Money m = new Money(3.555);
        assertEquals(m.getMoney(),3.56);
    }

    /**
     * test if it rounds 4.999 to 5
     */
    @Test
    public void testRound2(){
        Money m = new Money(4.999);
        assertEquals(m.getMoney(), 5.0);
    }

    /**
     * tests if it doesn't round if it's below 5
     */
    @Test
    public void testRound3(){
        Money m = new Money(1.234);
        assertEquals(m.getMoney(), 1.23);
    }
}
