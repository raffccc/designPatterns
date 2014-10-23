package factory;

/**
 * Factory for pizzas!
 * 
 * Factory isn't really a design pattern, it's more of a programming idiom.
 */
public class SimplePizzaFactory {

	public static Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			return new CheesePizza();
		} else if ("veggie".equals(type)) {
			return new VeggiePizza();
		}
		
		return null;
	}
	
}
