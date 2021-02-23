package ax.ha.it.mortage;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ReadFromFileTest extends TestCase {

    private ReadFromFile readfromfile = new ReadFromFile();
    private List<Prospects> list = readfromfile.readFile();

    @Test
    public void testReadFromFileFirstItem(){
        System.out.println(list.get(0).toString());
        assertEquals(list.get(0).getCustomer(), "Juha");
        assertEquals(list.get(0).getTotalLoan(), 1000.0);
        assertEquals(list.get(0).getInterest(), 5.0);
        assertEquals(list.get(0).getYears(), 2);
    }

    @Test
    public void testReadFromFileSecondItem(){
        System.out.println(list.get(1).toString());
        assertEquals(list.get(1).getCustomer(), "Karvinen");
        assertEquals(list.get(1).getTotalLoan(), 4356.0);
        assertEquals(list.get(1).getInterest(), 1.27);
        assertEquals(list.get(1).getYears(), 6);
    }

    @Test
    public void testReadFromFileThirdItem(){
        System.out.println(list.get(2).toString());
        assertEquals(list.get(2).getCustomer(), "Claes Månsson");
        assertEquals(list.get(2).getTotalLoan(), 1300.55);
        assertEquals(list.get(2).getInterest(), 8.67);
        assertEquals(list.get(2).getYears(), 2);
    }

    @Test
    public void testReadFromFileFourthItem(){
        System.out.println(list.get(3).toString());
        assertEquals(list.get(3).getCustomer(), "\"Clarencé,Andersson\"");
        assertEquals(list.get(3).getTotalLoan(), 2000.0);
        assertEquals(list.get(3).getInterest(), 6.0);
        assertEquals(list.get(3).getYears(), 4);
    }

    @Test
    public void testReadFromFileListSize(){
        assertEquals(list.size(), 4);
    }
}
