package maze;

public class Door implements MapSite {

	boolean isOpen;
	Room room1;
	Room room2;
	
	public Door() {
	}
	
	public Door(Room room1, Room room2) {
		this.room1 = room1;
		this.room2 = room2;
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}
	
	public Room getOtherSideFrom(Room r) {
		return null;
	}

}
