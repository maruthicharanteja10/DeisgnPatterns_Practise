package MediatorDesign;

public class AirportControlTower implements AirTrafficControlTower {

	@Override
	public void requestTakeoff(Aeroplane airplane) {
		airplane.notifyAirTrafficControl("Requesting takeoff clearance.");
	}

	@Override
	public void requestLanding(Aeroplane airplane) {
		 airplane.notifyAirTrafficControl("Requesting landing clearance.");
	}

}
