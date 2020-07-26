package Instruments;

public class Piano extends Instrument implements IPlay{

    public Piano(String color, String type) {
        super(color, type);
    }

    public String play() {
        return "Piano noises";
    }
}
