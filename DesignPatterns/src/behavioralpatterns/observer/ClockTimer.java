package behavioralpatterns.observer;

public class ClockTimer extends Subject {

	public int getHour() {
		return 10;
	}
	
	public int getMinute() {
		return 30;
	}
	
	public int getSecond() {
		return 45;
	}
	
	/**
	 * Gets called by an internal timer at regular intervals
	 * to provide an accurate time base. Tick updates this 
	 * object internal state and calls NotifyObservers to inform
	 * the change.
	 */
	public void tick() {
		//update internal time-keeping state
		notifyObservers();
	}
	
}
