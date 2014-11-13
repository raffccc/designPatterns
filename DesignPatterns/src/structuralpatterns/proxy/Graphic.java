package structuralpatterns.proxy;

import java.awt.Point;
import java.awt.event.MouseEvent;

public interface Graphic {
	
	Point getExtent();
	
	void HandleMouse(MouseEvent e);
	
	void Draw(Point at);

}
