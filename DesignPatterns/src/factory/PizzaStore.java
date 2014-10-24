package factory;

public abstract class PizzaStore {

	public Pizza orderPizza(String type) {
		/*
		 * Creating with factory, this doesn't have to be a static method, the factory could be
		 * an atribute of the pizzaStoreClass
		 */
		Pizza pizza = SimpleNewYorkPizzaFactory.createPizza(type);
		
		//Creating with factory method
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	/*
	 * Factory Method
	 * 
	 * The Factory Method Pattern defines an interface for creating an object, but lets subclasses 
	 * decide which class to instantiate, Factory Method lets a class defer instantiation to 
	 * subclasses
	 */
	public abstract Pizza createPizza(String type);
	
}
