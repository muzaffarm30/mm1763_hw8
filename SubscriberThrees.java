package hw;

public class SubscriberThrees implements Subscriber {

	private int eventsHandled;
	private int turnOffThreshold;
	
	
	

	public SubscriberThrees() {
		super();
	}

	private int getEventsHandled() {
		return eventsHandled;
	}

	private void setEventsHandled(int eventsHandled) {
		this.eventsHandled = eventsHandled;
	}


	public void setTurnOffThreshold(int turnOffThreshold) {
		this.turnOffThreshold = turnOffThreshold;
	}

	@Override
	public boolean notifySubscriber(Event e) {
		// TODO Auto-generated method stub
		
		if(e.getEventDataValaue()%3==0) {
			eventsHandled++;
			if(eventsHandled<=turnOffThreshold) {
				System.out.println("SubscriberThrees: Event is Threes : "+e.getEventDataValaue());
				return true;
			}
			else {
				if(e.getEventDataValaue()%40==0) {
					eventsHandled =0;
					return false;
				}
			}
		}
		return false;
	}
}
