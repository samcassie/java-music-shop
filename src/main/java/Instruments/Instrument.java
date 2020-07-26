package Instruments;

import ShopAssets.ISell;

public class Instrument implements ISell {

    private String color;
    private String type;

    public Instrument(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public int calculateMarkup(int buyPrice, int sellPrice){
        return (sellPrice - buyPrice);
    }

}
