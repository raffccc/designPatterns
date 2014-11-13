package behavioralpatterns.observer;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Subject {
	
	private Collection<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

}
