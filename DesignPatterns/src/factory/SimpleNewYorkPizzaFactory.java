package factory;

/**
 * Factory for pizzas!
 * 
 * Factory isn't really a design pattern, it's more of a programming idiom.
 */
public class SimpleNewYorkPizzaFactory {

	public static Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			return new CheesePizza(new NewYorkIngredientFactory());
		} else if ("veggie".equals(type)) {
			return new VeggiePizza(new NewYorkIngredientFactory());
		}
		
		return null;
	}
	
}
