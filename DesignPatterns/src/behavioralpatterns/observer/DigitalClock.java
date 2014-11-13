package behavioralpatterns.observer;

public class DigitalClock implements Observer {

	private ClockTimer c;
	
	public DigitalClock(ClockTimer c) {
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
		System.out.println("Printing digital time: " + c.getHour() + 
				":" + c.getMinute() + ":" + c.getSecond());
	}
	
	@Override
	protected void finalize() throws Throwable {
		this.c.detach(this);
		super.finalize();
	}

}
