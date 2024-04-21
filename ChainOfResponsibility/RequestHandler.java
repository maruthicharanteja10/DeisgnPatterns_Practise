package ChainOfResponsibility;

public abstract class RequestHandler {
	String name;

	public abstract void handleRequest(Request request);

	private RequestHandler successor;

	public RequestHandler(String name) {
		super();
		this.name = name;
	}

	protected void next(Request request) {
		if (successor != null) {
			successor.handleRequest(request);
		}
	}

	public void setSuccessor(RequestHandler successor) {
		this.successor = successor;
	}

}
