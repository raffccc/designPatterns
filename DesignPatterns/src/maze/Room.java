package maze;

import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite {

	int roomNumber;
	Map<Direction, MapSite> sides = new HashMap<Direction, MapSite>();
	
	public Room() {
	}
	
	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub
	}
	
	public void setSide(Direction d, MapSite ms) {
		sides.put(d, ms);
	}
	
	public MapSite getSide(Direction d) {
		return null;
	}

}
