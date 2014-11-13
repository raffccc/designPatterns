package structuralpatterns.bridge;

import java.awt.Point;

import javax.swing.text.View;

public abstract class Window {

	//Implementor is the bridge
	private WindowImp implementor;
	
	private View contents;
	
	public void drawContents() {
	}
	
	public void drawLine(Point a, Point b) {
		
	}
	
	public void drawRect(Point a, Point b) {
		getWindowImp().deviceRect(a.x, a.y, b.x, b.y);
	}
	
	public void drawPolygon(Point[] points, int n) {
		
	}
	
	public void drawText(String text, Point a) {
		
	}
	
	/*
	 * Window operations are defined in terms of this
	 * implementor
	 */
	protected WindowImp getWindowImp() {
		if (implementor == null) {
			implementor = WindowSystemFactory.getInstance().makeWindowImp();
		}
		return implementor;
	}
	
	protected View getView() {
		return contents;
	}
	
}
