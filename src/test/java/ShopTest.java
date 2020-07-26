import Instruments.Guitar;
import Instruments.Piano;
import ShopAssets.Microphone;
import ShopAssets.MusicStand;
import ShopAssets.SellableItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Guitar guitar;
    Piano piano;
    MusicStand musicStand;
    Microphone microphone;
    SellableItem sellableItem1;
    SellableItem sellableItem2;
    SellableItem sellableItem3;
    SellableItem sellableItem4;
    Shop shop;

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
        shop = new Shop("Music Mad");
    }

    @Test
    public void canGetValues(){
        assertEquals("Music Mad", shop.getName());
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.numOfItemsInStock());
    }

    @Test
    public void canAddToStock(){
        shop.addToStock(sellableItem1);
        shop.addToStock(sellableItem2);
        shop.addToStock(sellableItem3);
        shop.addToStock(sellableItem4);
        assertEquals(4, shop.numOfItemsInStock());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addToStock(sellableItem1);
        shop.addToStock(sellableItem2);
        shop.addToStock(sellableItem3);
        shop.addToStock(sellableItem4);
        shop.removeFromStock(sellableItem1);
        shop.removeFromStock(sellableItem4);
        assertEquals(2, shop.numOfItemsInStock());
    }

    @Test
    public void canCalculateStockProfit(){
        shop.addToStock(sellableItem1);
        shop.addToStock(sellableItem2);
        shop.addToStock(sellableItem3);
        shop.addToStock(sellableItem4);
        assertEquals(860, shop.calculateStockProfit());
    }


}
