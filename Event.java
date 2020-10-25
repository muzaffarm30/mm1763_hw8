package hw;

public class Event {

	private int eventSequenceNum;
	private int eventDataValaue;
	
	
	public Event( int eventDataValaue) {
		
		this.eventDataValaue = eventDataValaue;
	}
	
	public int getEventSequenceNum() {
		return eventSequenceNum;
	}
	public int getEventDataValaue() {
		return eventDataValaue;
	}
	
}
