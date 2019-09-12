package characters;

import items.Collectable;
import items.*;

import java.util.ArrayList;

public class Cleric extends Entity {

    private ArrayList<Collectable> collectables;
    private HealingItem healingItem;

    public Cleric(int health, String name, HealingItem healingItem) {
        super(health, name);
        this.healingItem = healingItem;
    }

    public void defend(int damage){
        this.health -= damage;
    }

    public void heal(Entity entity, int recovery) {
        entity.recover(recovery);
    }

    public void recover(int health){
        this.health += health;
        if(this.health > 100){this.health = 100;}
    }

    public HealingItem getHealingItem() {
        return healingItem;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }
}
