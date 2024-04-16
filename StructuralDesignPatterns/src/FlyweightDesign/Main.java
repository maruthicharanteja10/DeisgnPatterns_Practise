package FlyweightDesign;

public class Main {
	public static void main(String[] args) {
	    FlyweightFactory flyweightFactory = new FlyweightFactory();
	    Client client = new Client(flyweightFactory);

	    client.WriteNotes();
	  }
}
