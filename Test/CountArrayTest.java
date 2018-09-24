import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountArrayTest {
    CountArray object;
    @Before
    public void setUp() throws Exception {
        object=new CountArray();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void countArray() {
        String arr[]=new String[]{"a","b","c","d","a","c","c"};
        String expectedOutput="{a=true, b=false, c=true, d=false}";
        assertEquals(expectedOutput,object.countArray(arr));

    }

    @Test
    public void countArray2() {
        String arr[]=new String[]{"a","b","c","d","a","b","c"};
        String expectedOutput="{a=true, b=true, c=true, d=false}";
        assertEquals(expectedOutput,object.countArray(arr));

    }
}