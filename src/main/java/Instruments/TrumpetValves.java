package Instruments;

public enum TrumpetValves {

    TWO(2),
    FOUR(4),
    SIX(6);

    private final int value;

    TrumpetValves(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}
