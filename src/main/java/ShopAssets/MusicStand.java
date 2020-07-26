package ShopAssets;

public class MusicStand implements ISell {

    private int height;
    private String color;

    public MusicStand(int height, String color) {
        this.height = height;
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int calculateMarkup(int buyPrice, int sellPrice){
        return (sellPrice - buyPrice);
    }
}
