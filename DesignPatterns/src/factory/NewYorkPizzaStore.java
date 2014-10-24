package factory;

public class NewYorkPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if ("cheese".equals(type)) {
			pizza = new CheesePizza(new NewYorkIngredientFactory());
			pizza.setName("New York Cheese Pizza");
		}
		
		return pizza;
	}

}
