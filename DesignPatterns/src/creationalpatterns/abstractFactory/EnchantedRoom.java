package creationalpatterns.abstractFactory;

import maze.Room;

public class EnchantedRoom extends Room {

	Spell spell;
	
	public EnchantedRoom(int number, Spell spell) {
		super(number);
		this.spell = spell;
	}
	
}
