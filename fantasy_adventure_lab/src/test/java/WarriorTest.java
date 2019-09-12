import characters.Warrior;
import items.Armour;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;

    @Before
    public void SetUp() {
        warrior = new Warrior(100, "Louise the Warrior", Armour.PLATE, Weapon.BOW);

    }

    @Test
    public void canGetArmour() {
        assertEquals(Armour.PLATE, warrior.getArmour());
    }

    @Test
    public void canGetName() {
        assertEquals("Louise the Warrior", warrior.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(100, warrior.getHealth());
    }

    @Test
    public void canSetWeapon() {
        warrior.setWeapon(Weapon.AXE);
        assertEquals(Weapon.AXE, warrior.getWeapon());
    }

    @Test
    public void canTakeDamage() {
        warrior.defend(60);
        assertEquals(90, warrior.getHealth());
        warrior.defend(10);
        assertEquals(90, warrior.getHealth());
    }

    @Test
    public void canAttack() {
        warrior.attack(warrior, Weapon.BOW.getDamage());
        assertEquals(90, warrior.getHealth());


    }

}
