import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("brown", "wooden");
    }

    @Test
    public void canGetValues(){
        assertEquals("brown", piano.getColor());
        assertEquals("wooden", piano.getType());
    }

    @Test
    public void canPlay(){
        assertEquals("Piano noises", piano.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, piano.calculateMarkup(100, 200));
    }
}
