package structuralpatterns.bridge;

/**
 * Subclasses of WindowImp support different window systems.
 * This class supports the X Window System 
 */
public class XWindowImp extends WindowImp {
	
	@Override
	public void deviceRect(int x1, int y1, int x2, int y2) {
		//lots of X window system-specific calculations
	}

}
