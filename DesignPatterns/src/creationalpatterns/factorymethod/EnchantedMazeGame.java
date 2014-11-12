package creationalpatterns.factorymethod;

import maze.Door;
import maze.Room;
import creationalpatterns.abstractFactory.Alohomora;
import creationalpatterns.abstractFactory.DoorNeedingSpell;
import creationalpatterns.abstractFactory.EnchantedRoom;
import creationalpatterns.abstractFactory.Spell;

public class EnchantedMazeGame extends MazeGame {
	
	@Override
	public Room makeRoom(int n) {
		return new EnchantedRoom(n, castSpell());
	}
	
	protected Spell castSpell() {
		return new Alohomora();
	}
	
	@Override
	public Door makeDoor(Room r1, Room r2) {
		return new DoorNeedingSpell(r1, r2);
	}
	
}
