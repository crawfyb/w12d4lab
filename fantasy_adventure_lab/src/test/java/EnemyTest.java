import characters.Enemy;
import characters.Warrior;
import items.Armour;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Enemy enemy;
    Warrior warrior;

    @Before
    public void SetUp(){
        enemy = new Enemy(100, "Gavin the Goblin", 30);
        warrior = new Warrior(100, "Louise the Warrior", Armour.PLATE, Weapon.BOW);
    }

    @Test
    public void canGetName(){
        assertEquals("Gavin the Goblin", enemy.getName());
    }

    @Test
    public void canDamage(){
        enemy.attack(enemy, 40);
        assertEquals(60, enemy.getHealth());
    }

    @Test
    public void canBeDamaged(){
        warrior.attack(enemy, warrior.getWeapon().getDamage());
        assertEquals(40, enemy.getHealth());
    }

}
