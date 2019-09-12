package items;

public enum Pet {

    DRAGONFLY(25),
    HIPPOGRYTH(40),
    GRIFFIN(50),
    SEAMONKEY(0);

    private final int resistance;

    Pet(int resistance) {
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }



}
