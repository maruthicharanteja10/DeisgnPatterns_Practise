package CommandDesign;

public class CommandMain {
	public static void main(String[] args) {
	      Stock abcStock = new Stock();

	      BuyStock buyStockOrder = new BuyStock(abcStock);
	      SellStock sellStockOrder = new SellStock(abcStock);

	      Broker broker = new Broker();
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);
	      broker.takeOrder(sellStockOrder);
	      broker.placeOrders();
	   }
}
