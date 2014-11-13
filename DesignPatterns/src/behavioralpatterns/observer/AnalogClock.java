package behavioralpatterns.observer;

public class AnalogClock implements Observer {

private ClockTimer c;
	
	public AnalogClock(ClockTimer c) {
		this.c = c;
		c.attach(this);
	}
	
	@Override
	public void update(Subject changedSubject) {
		if (c == changedSubject) {
			draw();
		}
	}
	
	public void draw() {
		System.out.println("Printing analog time: " + c.getHour() + 
				":" + c.getMinute() + ":" + c.getSecond());
	}
	
	@Override
	protected void finalize() throws Throwable {
		this.c.detach(this);
		super.finalize();
	}

}
