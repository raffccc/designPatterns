package creationalpatterns.abstractFactory;

import maze.Door;
import maze.Room;

public class EnchantedMazeFactory extends MazeFactory {

	@Override
	public Room makeRoom(int n) {
		return new EnchantedRoom(n, castSpell());
	}
	
	@Override
	public Door makeDoor(Room r1, Room r2) {
		return new DoorNeedingSpell(r1, r2);
	}
	
	protected Spell castSpell() {
		return new Alohomora();
	}
	
}