package creationalpatterns.abstractFactory;

import maze.Direction;
import maze.Door;
import maze.Maze;
import maze.Room;

public class MazeGame {

	public Maze createMaze(MazeFactory factory) {
		Maze aMaze = new Maze();
		Room r1 = factory.makeRoom(1);
		Room r2 = factory.makeRoom(2);
		Door theDoor = factory.makeDoor(r1, r2);
		
		aMaze.addRoom(r1);
		aMaze.addRoom(r2);
		
		r1.setSide(Direction.NORTH, factory.makeWall());
		r1.setSide(Direction.EAST, theDoor);
		r1.setSide(Direction.SOUTH, factory.makeWall());
		r1.setSide(Direction.WEST, factory.makeWall());
		
		r2.setSide(Direction.NORTH, factory.makeWall());
		r2.setSide(Direction.EAST, factory.makeWall());
		r2.setSide(Direction.SOUTH, factory.makeWall());
		r2.setSide(Direction.WEST, theDoor);
		
		return aMaze;
	}
	
}
