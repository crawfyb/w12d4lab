package items;

public enum HealingItem {

    POTION(50),
    HERB(20),
    BANDAGE(15),
    PARACETAMOL(5),
    OXYCODON(90),
    KETAMINE(35);




    private final int recovery;

    HealingItem(int recovery) {
        this.recovery = recovery;
    }

    public int getRecovery() {
        return recovery;
    }
}
