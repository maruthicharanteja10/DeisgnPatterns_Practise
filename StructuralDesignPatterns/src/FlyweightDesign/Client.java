package FlyweightDesign;

public class Client {
	private FlyweightFactory flyweightFactory;

	public Client(FlyweightFactory flyweightFactory) {
		this.flyweightFactory = flyweightFactory;
	}

	public void WriteNotes() {
		Pen redRefill = flyweightFactory.getPen("red");
		Pen greenRefill = flyweightFactory.getPen("green");
		Pen blueRefill = flyweightFactory.getPen("blue");

		redRefill.write();
		greenRefill.write();
		blueRefill.write();
	}
}
