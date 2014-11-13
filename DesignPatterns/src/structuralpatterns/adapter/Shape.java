package structuralpatterns.adapter;

import java.awt.Point;

public abstract class Shape {
	
	public void boundingBox(Point bottomLeft, Point topRight) {
	}
	
	public abstract Manipulator createManipulator();
}
