package FlyweightDesign;

public class Refill implements Pen {
	private String color;

	public Refill(String color) {
		this.color = color;
	}

	@Override
	public void write() {
		System.out.println("Writes notes with refill color : " + color);
	}

}
