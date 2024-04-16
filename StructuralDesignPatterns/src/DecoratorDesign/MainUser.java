package DecoratorDesign;

public class MainUser {

	public static void main(String[] args) {
		
		Pizza pizza = new PlainPizza();

		// Add cheese and pepperoni toppings
		pizza = new ChesseDecorator(pizza);
		pizza = new PepperoniDcorator(pizza);

		// Get the price of the pizza
	
		System.out.println("The price of the pizza is: " + pizza.getprice());
	}

}
