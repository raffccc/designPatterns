package behavioralpatterns.command;

public class PasteCommand implements Command {

	private Document d;
	
	public PasteCommand(Document d) {
		this.d = d;
	}
	
	@Override
	public void execute() {
		d.paste();
	}

}
