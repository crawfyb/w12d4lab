import characters.Warrior;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;

    @Before
    public void SetUp(){
        warrior = new Warrior(100, "Louise", 100, Weapon.BOW);

    }

    @Test
    public void canGetArmour(){
        assertEquals(100, warrior.getArmour());
    }

    @Test
    public void canGetName(){
        assertEquals("Louise", warrior.getName());
    }

    @Test
    public void canGetHealth(){
        assertEquals(100, warrior.getHealth());
    }

    @Test
    public void canSetWeapon(){
        warrior.setWeapon(Weapon.AXE);
        assertEquals(Weapon.AXE, warrior.getWeapon());
    }


}
