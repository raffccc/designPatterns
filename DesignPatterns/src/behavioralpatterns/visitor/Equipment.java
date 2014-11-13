package behavioralpatterns.visitor;

import java.math.BigDecimal;

public abstract class Equipment {

	private String name;
	
	protected Equipment(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public abstract BigDecimal getNetPrice();
	public abstract BigDecimal getDiscountPrice();
	public abstract void accept(EquipmentVisitor visitor);
	
}
