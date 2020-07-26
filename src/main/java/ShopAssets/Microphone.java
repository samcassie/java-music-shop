package ShopAssets;

public class Microphone implements ISell{

    private String color;

    public Microphone(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int calculateMarkup(int buyPrice, int sellPrice){
        return (sellPrice - buyPrice);
    }
}
