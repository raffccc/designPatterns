package behavioralpatterns.command;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Manages a sequence of subcommands and provides operations for adding
 * and removing subcommands. No explicit receiver is required, because
 * the subcommands already define their receiver 
 */
public class MacroCommand implements Command {

	private Collection<Command> commands = new ArrayList<Command>();
	
	public void add(Command c) {
		commands.add(c);
	}
	
	public void remove(Command c) {
		commands.remove(c);
	}
	
	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}

}
