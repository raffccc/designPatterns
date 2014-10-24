package factory;

public class NewYorkIngredientFactory implements IngredientFactory {

	@Override
	public String createDough() {
		return "Thick Dough";
	}

	@Override
	public String createSauce() {
		return "Mariana Sauce";
	}

}
