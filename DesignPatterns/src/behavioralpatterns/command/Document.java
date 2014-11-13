package behavioralpatterns.command;

public class Document {
	
	private String name;
	
	public Document(String name) {
		this.name = name;
	}
	
	public String open() {
		return "This is the document, hopefully";
	}
	
	public void paste() {
		System.out.println("Pasted!");
	}

}
