package factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		if ("cheese".equals(type)) {
			return new ChicagoCheesePizza();
		}
		
		return null;
	}

}
