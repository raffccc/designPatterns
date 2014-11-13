package behavioralpatterns.command;

import java.util.ArrayList;
import java.util.Collection;

public class Application {

	private Collection<Document> documents = new ArrayList<Document>();
	
	public void add(Document d) {
		documents.add(d);
	}

}
