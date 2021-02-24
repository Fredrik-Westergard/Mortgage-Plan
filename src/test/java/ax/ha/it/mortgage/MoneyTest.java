package ax.ha.it.mortgage;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class MoneyTest extends TestCase {
    @Test
    public void testRound(){
        Money m = new Money(3.555);
        assertEquals(m.getMoney(),3.56);
    }

    @Test
    public void testRound2(){
        Money m = new Money(4.999);
        assertEquals(m.getMoney(), 5.0);
    }

    @Test
    public void testRound3(){
        Money m = new Money(1.234);
        assertEquals(m.getMoney(), 1.23);
    }
}
