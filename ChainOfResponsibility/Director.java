package ChainOfResponsibility;

public class Director extends RequestHandler {
	public Director() {
		super("Director");
	}

	@Override
	public void handleRequest(Request request) {
		if (request.getAmount() < 10000 && request.getAmount() > 1000) {
			System.out.println("Director approves request: " + request);
		} else {
			next(request);
		}
	}
}