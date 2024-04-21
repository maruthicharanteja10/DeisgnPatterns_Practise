package MediatorDesign;

public class MediatorMain {
	public static void main(String[] args) {
		AirTrafficControlTower controlTower = new AirportControlTower();

		// Instantiate Concrete Colleagues (Commercial Airplanes)
		Aeroplane airplane1 = new CommercialAeroplane(controlTower);
		Aeroplane airplane2 = new CommercialAeroplane(controlTower);

		// Set up the association between Concrete Colleagues and the Mediator
		airplane1.requestTakeoff();
		airplane2.requestLanding();
	}
}
