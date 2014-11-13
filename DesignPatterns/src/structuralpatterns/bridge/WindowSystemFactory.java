package structuralpatterns.bridge;

public class WindowSystemFactory {
	
	private static WindowSystemFactory instance;
	
	protected WindowSystemFactory() {
	}
	
	public static WindowSystemFactory getInstance() {
		if (instance == null) {
			instance = new WindowSystemFactory();
		}
		return instance;
	}

	public WindowImp makeWindowImp() {
		return new WindowImp();
	}

}
