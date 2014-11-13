package structuralpatterns.adapter;

import java.awt.Point;

public class TextShape extends Shape {

	private TextView textView;
	
	public TextShape(TextView textView) {
		this.textView = textView;
	}
	
	@Override
	public void boundingBox(Point bottomLeft, Point topRight) {
		int left = 0;
		int bottom = 3;
		int width = 4;
		int height = 2;
		
		textView.getOrigin(bottom, left);
		textView.getExtent(width, height);
		
		bottomLeft.x = left;
		bottomLeft.y = bottom;
		
		topRight.x = bottom-height;
		topRight.y = left+width;
	}
	
	public boolean isEmpty() {
		return this.textView.isEmpty();
	}
	
	@Override
	public Manipulator createManipulator() {
		return new TextManipulator(this);
	}

}
