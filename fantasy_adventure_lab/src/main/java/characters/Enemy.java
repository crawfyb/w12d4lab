package characters;

import behaviours.IAttack;

public class Enemy extends Entity implements IAttack {

    private int damage;

    public Enemy(int health, String name, int damage){
        super(health, name);
        this.damage = damage;
    }

    public void defend(int damage){
        this.health -= damage;

    }

    public void attack(Entity entity, int damage){
        entity.defend(damage);
    }

    public int getHealth() {
        return this.health;
    }

    public void recover(int health){
        this.health += health;
        if(this.health > 100)
        {this.health = 100;}
    }

    public String getName(){
        return this.name;
    }

    public int getDamage() {
        return damage;
    }

}
