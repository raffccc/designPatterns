package factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore store = new NewYorkPizzaStore();
		store.orderPizza("cheese");
	}
	
}
