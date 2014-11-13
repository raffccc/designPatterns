package structuralpatterns.proxy;

import java.awt.Point;
import java.awt.event.MouseEvent;

/**
 * This class represents a file that contains a huge image,
 * so its loading must be avoided.
 */
public class Image implements Graphic {

	public Image(String file) {
		//loads image from a file
	}

	@Override
	public Point getExtent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void HandleMouse(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Draw(Point at) {
		// TODO Auto-generated method stub
		
	}
	
}
