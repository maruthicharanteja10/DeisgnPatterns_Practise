package ChainOfResponsibility;

public class Request {

	private int amount;

	public Request(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Request for amount: " + amount;
	}
}
