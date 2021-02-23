package ax.ha.it.mortage;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ReadFromFileTest extends TestCase {

    @Test
    public void testReadFromFile(){
        ReadFromFile readfromfile = new ReadFromFile();

        List<Prospects> list = readfromfile.readFile();

        assertEquals(list.get(0).getCustomer(), "Juha");
    }
}
