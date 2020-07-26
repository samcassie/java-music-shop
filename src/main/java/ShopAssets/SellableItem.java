package ShopAssets;

public class SellableItem {

    private ISell itemSelling;
    private int buyPrice;
    private int sellPrice;

    public SellableItem(ISell itemSelling, int buyPrice, int sellPrice) {
        this.itemSelling = itemSelling;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public ISell getItemSelling() {
        return itemSelling;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
