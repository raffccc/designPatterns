package factory;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		/*
		 * Creating with factory, this doesn't have to be a static method, the factory could be
		 * an atribute of the pizzaStoreClass
		 */
		Pizza pizza = SimplePizzaFactory.createPizza(type);
		
		//Creating with factory method
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	//Factory Method
	public abstract Pizza createPizza(String type);
	
}
