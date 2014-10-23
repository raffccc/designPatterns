package factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore store = new ChicagoPizzaStore();
		store.orderPizza("cheese");
	}
	
}
