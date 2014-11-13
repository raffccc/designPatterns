package behavioralpatterns.command;

/**
 * Opens a documento whose name is supplied by the user.
 */
public class OpenCommand implements Command {

	private Application app;
	
	public OpenCommand(Application app) {
		this.app = app;
	}
	
	@Override
	public void execute() {
		String documentName = askUser();
		
		if (documentName != null) {
			Document d = new Document(documentName);
			app.add(d);
			d.open();
		}
	}
	
	public String askUser() {
		//Prompts the user for the name of the document to open
		return "";
	}

}
