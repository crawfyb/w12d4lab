package characters;

import behaviours.IDefend;
import items.*;

import java.util.ArrayList;

public class Wizard extends Entity {

    private ArrayList<Collectable> collectables;
    private Spell spell;
    private Pet pet;

    public Wizard(int health, String name, Spell spell, Pet pet) {
        super(health, name);
        this.spell = spell;
        this.pet = pet;
    }

    public void defend(int damage){
        int remove = damage - pet.getResistance();
        if(remove >0){this.health -= remove;}
    }


    public void castSpell(Entity entity, int damage){
        entity.defend(damage);
    }

    public void setSpell(Spell spell){
        this.spell = spell;
    }

    public Spell getSpell() {
        return this.spell;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return this.pet;
    }

    public int getHealth() {
        return this.health;
    }

    public String getName(){
        return this.name;
    }


}
