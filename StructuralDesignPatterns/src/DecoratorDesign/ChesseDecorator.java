package DecoratorDesign;

public class ChesseDecorator extends ToppingDecorator{

	public ChesseDecorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double toppingsPrice() {
		// TODO Auto-generated method stub
		return 20.0;
	}

}
