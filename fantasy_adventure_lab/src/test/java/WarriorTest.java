import characters.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;

    @Before
    public void SetUp(){
        warrior = new Warrior(100, "Louise", 100);

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


}
