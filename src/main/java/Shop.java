import ShopAssets.ISell;
import ShopAssets.SellableItem;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<SellableItem> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<SellableItem>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<SellableItem> getStock() {
        return stock;
    }

    public int numOfItemsInStock(){
        return stock.size();
    }

    public void addToStock(SellableItem item){
        this.stock.add(item);
    }

    public void removeFromStock(SellableItem item){
        this.stock.remove(item);
    }

    public int calculateStockProfit(){
        int total = 0;
        for (SellableItem item : stock){
            total += item.getItemSelling().calculateMarkup(item.getBuyPrice(), item.getSellPrice());
        }
        return total;
    }
}
