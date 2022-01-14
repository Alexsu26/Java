package castle.src;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String, Room> exits = new HashMap<>();

    public Room(String description) {
        this.description = description;
    }

    public void setExit(String dir, Room r) {
        exits.put(dir, r);
    }

    public String getExitDes() {
        StringBuffer sb = new StringBuffer();
        for( String s : exits.keySet() )
        {
            sb.append(s);
            sb.append(' ');
        }
        return sb.toString();
    }

    public Room getExit( String direction ) {
        return exits.get(direction);
    }

    @Override
    public String toString() {
        return description;
    }
}
