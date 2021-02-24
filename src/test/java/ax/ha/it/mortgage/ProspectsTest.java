package ax.ha.it.mortgage;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

/**
 * prospects test using JUnit
 * @author Fredrik Westergård
 */
public class ProspectsTest extends TestCase {
    /**
     * test if prospects' getters work
     */
    @Test
    public void testProspects(){
        Prospects p = new Prospects("Westergård",1000.59,5.65,2);
        assertEquals(p.getInterest(), 5.65);
        assertEquals(p.getTotalLoan().getMoney(), 1000.59);
        assertEquals(p.getYears(), 2);
        assertEquals(p.getCustomer(), "Westergård");
    }
}
