package behavioralpatterns.command;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Commands that aren't undoable and don't require arguments.
 * This solution only works for simple commands. More complex commands that keep track of not 
 * only their receivers but also arguments and/or undo state require a Command subclass.
 */
public class SimpleCommand<T extends Receiver> implements Command {

	private Method action;
	private T receiver;
	
	public SimpleCommand(T r, Method a) {
		this.action = a;
		this.receiver = r;
	}
	
	@Override
	public void execute() {
		try {
			action.invoke(receiver);
		} catch (IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		//This is how to invoke this simple command
		MyClass m = new MyClass();
		Command aCommand = new SimpleCommand<MyClass>(m, m.getClass().getMethod("doStuff"));
		aCommand.execute();
	}
	

}