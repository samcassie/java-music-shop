import Instruments.Trumpet;
import Instruments.TrumpetValves;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet("golden", "piccolo", TrumpetValves.FOUR);
    }

    @Test
    public void canGetValues(){
        assertEquals("golden", trumpet.getColor());
        assertEquals("piccolo", trumpet.getType());
        assertEquals(4, trumpet.getNumOfValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Trumpet noises", trumpet.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, trumpet.calculateMarkup(100, 200));
    }

}
