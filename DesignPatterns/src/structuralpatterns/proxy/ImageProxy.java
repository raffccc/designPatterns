package structuralpatterns.proxy;

import java.awt.Point;
import java.awt.event.MouseEvent;

public class ImageProxy implements Graphic {
	
	private String filename;
	private Image image;
	private Point extent;
	
	public ImageProxy(String filename) {
		this.filename = filename;
	}
	
	protected Image getImage() {
		if (image == null) {
			image = new Image(filename);
		}
		return image;
	}

	@Override
	public Point getExtent() {
		if (extent == null) {
			extent = getImage().getExtent();
		}
		return extent;
	}

	@Override
	public void HandleMouse(MouseEvent e) {
		getImage().HandleMouse(e);
	}

	@Override
	public void Draw(Point at) {
		getImage().Draw(at);
	}

}