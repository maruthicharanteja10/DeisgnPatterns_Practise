package DecoratorDesign;

public class PepperoniDcorator extends ToppingDecorator{

	public PepperoniDcorator(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected double toppingsPrice() {
		// TODO Auto-generated method stub
		return 10.0;
	}

}
