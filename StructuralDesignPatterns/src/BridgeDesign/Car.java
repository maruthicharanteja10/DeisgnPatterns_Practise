package BridgeDesign;

public class Car extends Vehicle {

	public Car(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2);
	}

	@Override
	public void manufacture() {
		System.out.print("car ");
		workshop1.work();
		workshop2.work();
	}

}
