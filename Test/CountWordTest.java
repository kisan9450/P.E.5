import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

public class CountWordTest {
    CountWord object;
    @Before
    public void setUp() throws Exception {
        object=new CountWord();
    }

    @After
    public void tearDown() throws Exception {
        object=null;
    }

    @Test
    public void countWords() {
        String expectedOutput="{one=5, two=2, three=2}";
        String input="one one -one___two,,three,one @three*one?two";
        assertEquals(expectedOutput,object.countWords(input));
    }

    @Test
    public void countWords2() {
        String expectedOutput="{no=4, yes=3}";
        String input="no no no no yes yes yes";
        assertEquals(expectedOutput,object.countWords(input));
    }
}