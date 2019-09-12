import characters.Enemy;
import characters.Warrior;
import dungeon.Room;
import items.Armour;
import items.Collectable;
import items.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Enemy enemy;
    Warrior warrior;
    Collectable collectable;

    @Before
    public void SetUp(){
        enemy = new Enemy(100, "Gavin the Goblin", 30);
        warrior = new Warrior(100, "Louise the Warrior", Armour.PLATE, Weapon.BOW);
        room = new Room(false);
        room.addEnemy(enemy);
    }

    @Test
    public void roomHasEnemy(){
        assertEquals("Gavin the Goblin", room.getEnemies().get(0).getName());
    }

    @Test
    public void playerCanAttackEnemy(){
        warrior.attack(room.getEnemies().get(0), warrior.getWeapon().getDamage());
        assertEquals(40, room.getEnemies().get(0).getHealth());
    }

    @Test
    public void enemyCanAttackPlayer(){
        room.getEnemies().get(0).attack(warrior, 60);
        assertEquals(90, warrior.getHealth());
    }

    @Test
    public void CharactersFight(){
        warrior.attack(room.getEnemies().get(0), warrior.getWeapon().getDamage());
        assertEquals(40, room.getEnemies().get(0).getHealth());
        room.getEnemies().get(0).attack(warrior, 60);
        assertEquals(90, warrior.getHealth());

    }

}
