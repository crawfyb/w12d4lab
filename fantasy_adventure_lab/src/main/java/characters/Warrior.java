package characters;

import items.Collectable;

import java.util.ArrayList;

public class Warrior extends Entity {

    private ArrayList<Collectable> collectables;
    private int armour;

    public Warrior(int health, String name, int armour){
        super(health, name);
        collectables = new ArrayList<Collectable>();
        this.armour = armour;
    }

    public ArrayList<Collectable> getCollectables() {
        return collectables;
    }

//    public void addWeapon(Weapon weapon){
//        collectables.add(weapon);
//    }

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
