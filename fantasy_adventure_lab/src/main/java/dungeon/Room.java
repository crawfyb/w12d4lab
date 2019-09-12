package dungeon;

import characters.Enemy;
import items.Collectable;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<Collectable> treasures;
    private boolean isComplete;

    public Room(boolean isComplete){
        enemies = new ArrayList<Enemy>();
        treasures = new ArrayList<Collectable>();
        this.isComplete = isComplete;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }

    public ArrayList<Collectable> getTreasures() {
        return treasures;
    }

    public void addCollectable(Collectable collectable){
        treasures.add(collectable);
    }

    public boolean isComplete() {
        return isComplete;
    }
}
