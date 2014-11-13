package behavioralpatterns.visitor;

import java.math.BigDecimal;

/**
 * This class will compute the total cost of all nodes in the equipment structure 
 */
public class PricingVisitor extends EquipmentVisitor {

	private BigDecimal total;
	
	@Override
	public void visitFloopyDisk(FloopyDisk floopyDisk) {
		total.add(floopyDisk.getNetPrice());
	}

	@Override
	public void visitChassis(Chassis chassis) {
		total.add(chassis.getDiscountPrice());
	}

}
