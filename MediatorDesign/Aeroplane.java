package MediatorDesign;

public interface Aeroplane {
	void requestTakeoff();

	void requestLanding();

	void notifyAirTrafficControl(String message);
}
