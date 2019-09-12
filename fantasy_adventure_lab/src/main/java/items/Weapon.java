package items;

public enum Weapon {

    LONGSWORD(20),
    AXE(30),
    MACE(35),
    DAGGER(5),
    MORNINGSTAR(40),
    BOW(60),
    SPEAR(25);


    private final int damage;

    Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
