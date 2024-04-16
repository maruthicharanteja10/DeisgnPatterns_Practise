package DecoratorDesign;

public abstract class ToppingDecorator implements Pizza {
	protected Pizza pizza;

	protected abstract double toppingsPrice();

	public ToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return pizza.getprice() + toppingsPrice();
	}
}
