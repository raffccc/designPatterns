package behavioralpatterns.observer;

public class ObserverExecutor {

	public static void main(String[] args) {
		ClockTimer c = new ClockTimer();
		new DigitalClock(c);
		new AnalogClock(c);
		
		//All observers registered in ClockTimer will be notified when tick is called
		c.tick();
	}
	
}
