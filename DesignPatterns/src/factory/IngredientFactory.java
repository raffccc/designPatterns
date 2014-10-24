package factory;

/**
 * This is an Abstract Factory, it is used in composition with other classes.
 * It usually groups the creation of items of the same family, ingredients 
 * in this case.
 *
 * The drawback of this pattern is that if any new product get added here,
 * all classes that extend this will have to be updated.
 */
public interface IngredientFactory {

	String createDough();
	
	String createSauce();
	
}
