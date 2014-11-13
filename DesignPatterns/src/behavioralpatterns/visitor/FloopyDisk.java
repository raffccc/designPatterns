package behavioralpatterns.visitor;

import java.math.BigDecimal;

public class FloopyDisk extends Equipment {

	public FloopyDisk() {
		super("Floopy Disk");
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
		visitor.visitFloopyDisk(this);
	}

}
