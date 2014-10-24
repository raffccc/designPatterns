package factory;

public class VeggiePizza extends Pizza {

	private IngredientFactory factory;
	
	public VeggiePizza(IngredientFactory factory) {
		this.factory = factory;
	}
	
	/*
	 * (non-Javadoc)
	 * @see factory.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		System.out.println("Prepairing pizza: " + getName());
		setDough(this.factory.createDough());
		setSauce(this.factory.createSauce());
	}

}