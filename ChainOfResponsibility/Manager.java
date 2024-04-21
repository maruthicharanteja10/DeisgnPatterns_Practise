package ChainOfResponsibility;

public class Manager extends RequestHandler {
    public Manager() {
        super("Manager");
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getAmount() < 1000) {
            System.out.println("Manager approves request: " + request);
        } else {
            next(request);
        }
    }
}
