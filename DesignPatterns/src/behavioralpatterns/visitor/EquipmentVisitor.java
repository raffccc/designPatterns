package behavioralpatterns.visitor;

public abstract class EquipmentVisitor {
	
	public abstract void visitFloopyDisk(FloopyDisk floopyDisk);
	public abstract void visitChassis(Chassis chassis);
	
	//And so on for other subclasses of equipment
	
}
