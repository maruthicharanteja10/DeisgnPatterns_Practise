package MediatorDesign;

public class CommercialAeroplane implements Aeroplane {
	private AirTrafficControlTower mediator;

	public CommercialAeroplane(AirTrafficControlTower mediator) {
		super();
		this.mediator = mediator;
	}

	@Override
	public void requestTakeoff() {
		mediator.requestTakeoff(this);
	}

	@Override
	public void requestLanding() {
		mediator.requestLanding(this);
	}

	@Override
	public void notifyAirTrafficControl(String message) {
		System.out.println("Commercial Aeroplane : " + message);
	}

}
