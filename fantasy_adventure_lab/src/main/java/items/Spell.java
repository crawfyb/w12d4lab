package items;

public enum Spell {

    FIREBALL(30),
    LIGHTNINGBOLT(40),
    YOUSHALLNOTPASS(30),
    AVAKEDABRA(60);

    private final int damage;

    Spell(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
