package dungeon;

import java.util.ArrayList;

public class Quest {

    private ArrayList<Room> rooms;

    public Quest(){
        rooms = new ArrayList<Room>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }
}
