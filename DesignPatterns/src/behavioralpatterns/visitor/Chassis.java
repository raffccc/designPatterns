package behavioralpatterns.visitor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class Chassis extends Equipment {

	private Collection<Equipment> parts;
	
	public Chassis() {
		super("Chassis");
		this.parts = new ArrayList<Equipment>();
	}
	
	@Override
	public BigDecimal getNetPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getDiscountPrice() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(EquipmentVisitor visitor) {
		for (Equipment part : parts) {
			part.accept(visitor);
		}
		visitor.visitChassis(this);
	}

}
