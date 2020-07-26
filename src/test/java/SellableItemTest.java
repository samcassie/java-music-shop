import Instruments.Guitar;
import Instruments.Piano;
import ShopAssets.Microphone;
import ShopAssets.MusicStand;
import ShopAssets.SellableItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SellableItemTest {

    Guitar guitar;
    Piano piano;
    MusicStand musicStand;
    Microphone microphone;
    SellableItem sellableItem1;
    SellableItem sellableItem2;
    SellableItem sellableItem3;
    SellableItem sellableItem4;

    @Before
    public void before(){
        guitar = new Guitar("black", "electric", 6);
        piano = new Piano("brown", "wooden");
        musicStand = new MusicStand(1, "red");
        microphone = new Microphone("black");
        sellableItem1 = new SellableItem(guitar, 200, 400);
        sellableItem2 = new SellableItem(piano, 500, 1000);
        sellableItem3 = new SellableItem(musicStand, 20, 100);
        sellableItem4 = new SellableItem(microphone, 30, 110);
    }

    @Test
    public void canGetValues(){
        assertEquals(guitar, sellableItem1.getItemSelling());
        assertEquals(200, sellableItem1.getBuyPrice());
        assertEquals(400, sellableItem1.getSellPrice());
    }



}
