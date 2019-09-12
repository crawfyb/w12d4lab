package characters;

import behaviours.IDefend;
import items.Collectable;

import java.util.ArrayList;

public abstract class Entity implements IDefend {

     int health;
     String name;
     ArrayList<Collectable> collectables;

    public Entity(int health, String name){
        this.health = health;
        this.name = name;
    }
}
