import characters.Cleric;
import characters.Warrior;
import items.Armour;
import items.HealingItem;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Warrior warrior;

    @Before
    public void setUp() {
        cleric = new Cleric(100, "Matt the Cleric", HealingItem.HERB);
        warrior = new Warrior(100, "Louise the Warrior", Armour.LEATHER, Weapon.BOW);
    }

    @Test
    public void canGetHealingItem() {
        assertEquals(HealingItem.HERB, cleric.getHealingItem());
    }

    @Test
    public void canGetName(){
        assertEquals("Matt the Cleric", cleric.getName());
    }

    @Test
    public void canTakeDamage(){
        cleric.defend(20);
        assertEquals(80, cleric.getHealth());
    }

    @Test
    public void canHealSelf(){
        cleric.defend(30);
        cleric.heal(cleric, cleric.getHealingItem().getRecovery());
        assertEquals(90, cleric.getHealth());
    }

    @Test
    public void canHealOther(){
        warrior.defend(30);
        cleric.heal(warrior, cleric.getHealingItem().getRecovery());
        assertEquals(100, warrior.getHealth());
    }

}
