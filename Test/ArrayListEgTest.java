import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

import static org.junit.Assert.*;

public class ArrayListEgTest {
    ArrayListEg object;
    @Before
    public void setUp() throws Exception {
        object=new ArrayListEg();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void change() {
        List<String> expectedOutput=new ArrayList<String>();
        List<String> input=new ArrayList<String>();
        expectedOutput.add("Kiwi");
        expectedOutput.add("Grape");
        expectedOutput.add("Mango");
        expectedOutput.add("Berry");
        input.add("Apple");
        input.add("Grape");
        input.add("Melon");
        input.add("Berry");
        assertEquals(expectedOutput,object.change(input));
    }
}