package characters;

import items.Collectable;
import items.Weapon;

import java.util.ArrayList;

public class Warrior extends Entity {

    private ArrayList<Collectable> collectables;
    private int armour;
    private Weapon weapon;

    public Warrior(int health, String name, int armour, Weapon weapon){
        super(health, name);
        collectables = new ArrayList<Collectable>();
        this.armour = armour;
        this.weapon = weapon;


    }

    public ArrayList<Collectable> getCollectables() {
        return collectables;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getArmour() {
        return this.armour;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName(){
        return this.name;
    }




}
