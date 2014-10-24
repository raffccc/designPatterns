package factory;

public class CheesePizza extends Pizza {

	//Abstract factory
	private IngredientFactory factory;
	
	public CheesePizza(IngredientFactory factory) {
		this.factory = factory;
	}
	
	/*
	 * (non-Javadoc)
	 * @see factory.Pizza#prepare()
	 */
	@Override
	public void prepare() {
		System.out.println("Prepairing pizza: " + getName());
		String dough = this.factory.createDough();
		System.out.println("Making dough: " + dough);
		setDough(dough);
		String sauce = this.factory.createSauce();
		System.out.println("Putting sauce: " + sauce);
		setSauce(sauce);
	}
	
}