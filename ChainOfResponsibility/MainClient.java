package ChainOfResponsibility;

public class MainClient {
	public static void main(String[] args) {
		RequestHandler manager = new Manager();
		RequestHandler director = new Director();
		RequestHandler ceo = new CEO();

		manager.setSuccessor(director);
		director.setSuccessor(ceo);

		Request request1 = new Request(100);
		Request request2 = new Request(5000);
		Request request3 = new Request(15000);

		manager.handleRequest(request1);
		manager.handleRequest(request2);
		manager.handleRequest(request3);
	}
}
