package Instruments;

public class Guitar extends Instrument implements IPlay{

    private int numOfStrings;

    public Guitar(String color, String type, int numOfStrings) {
        super(color, type);
        this.numOfStrings = numOfStrings;
    }

    public int getNumOfStrings() {
        return numOfStrings;
    }

    public String play() {
        return "Guitar noises";
    }
}
