package Instruments;

public class Trumpet extends Instrument implements IPlay{

    private TrumpetValves numOfValves;

    public Trumpet(String color, String type, TrumpetValves numOfValves) {
        super(color, type);
        this.numOfValves = numOfValves;
    }

    public int getNumOfValves() {
        return numOfValves.getValue();
    }

    public String play() {
        return "Trumpet noises";
    }
}
