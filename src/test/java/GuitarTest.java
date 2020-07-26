import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("black", "electric", 6);
    }

    @Test
    public void canGetValues(){
        assertEquals("black", guitar.getColor());
        assertEquals("electric", guitar.getType());
        assertEquals(6, guitar.getNumOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Guitar noises", guitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, guitar.calculateMarkup(100, 200));
    }


}
