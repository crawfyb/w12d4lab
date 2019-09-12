package items;

public enum Armour {

    LEATHER(20),
    PLATE(50),
    PADDED(10),
    SCALE(30);

    private final int resistance;

    Armour(int resistance) {
        this.resistance = resistance;
    }

    public int getResistance() {
        return resistance;
    }
}
