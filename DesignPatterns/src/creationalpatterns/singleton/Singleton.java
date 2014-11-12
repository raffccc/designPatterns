package creationalpatterns.singleton;

public class Singleton {

	static Singleton instance;
	
	protected Singleton() {
		
	}
	
	public Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
