import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortedSetTest {
    SortedSet object;
    @Before
    public void setUp() throws Exception {
        object=new SortedSet();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void sortTheSet() {
        String[] input={"Harry","Olive",  "Alice",  "Bluto",  "Eugene"};
        String expectedOutput="[Alice, Bluto, Eugene, Harry, Olive]";
        assertEquals(expectedOutput,object.sortTheSet(input));
    }

    @Test
    public void sortTheSet2() {
        String[] input={"Palash","Kevin",  "Shubham",  "Akash",  "Arpit"};
        String expectedOutput="[Akash, Arpit, Kevin, Palash, Shubham]";
        assertEquals(expectedOutput,object.sortTheSet(input));
    }
}