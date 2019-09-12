package characters;

import items.Armour;
import items.Collectable;
import items.Weapon;

import java.util.ArrayList;

public class Warrior extends Entity {

    private ArrayList<Collectable> collectables;
    private Armour armour;
    private Weapon weapon;

    public Warrior(int health, String name, Armour armour, Weapon weapon){
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
        return this.weapon;
    }

    public void setArmour(Armour armour) {
        this.armour = armour;
    }

    public Armour getArmour() {
        return this.armour;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName(){
        return this.name;
    }




}
