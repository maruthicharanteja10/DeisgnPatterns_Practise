package ChainOfResponsibility;

public class CEO extends RequestHandler {
	public CEO() {
		super("CEO");
	}

	@Override
	public void handleRequest(Request request) {
		if (request.getAmount() > 10000) {
			System.out.println("CEO approves request: " + request);
		} else {
			next(request);
		}
	}
}