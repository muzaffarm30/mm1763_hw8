package hw;


public interface Subscriber {

	public boolean notifySubscriber(Event e);
	public void setTurnOffThreshold(int turnOffThreshold);
}
