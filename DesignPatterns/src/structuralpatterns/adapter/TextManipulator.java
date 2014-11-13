package structuralpatterns.adapter;

public class TextManipulator extends Manipulator {

	private TextShape textShape;
	
	public TextManipulator(TextShape textShape) {
		this.textShape = textShape;
	}

}
