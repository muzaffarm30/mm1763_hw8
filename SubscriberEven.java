package hw;

public class SubscriberEven  implements Subscriber{
	private int eventsHandled;
	private int turnOffThreshold;
	
	
	

	public SubscriberEven() {
		super();
	}

	public void setTurnOffThreshold(int turnOffThreshold) {
		this.turnOffThreshold = turnOffThreshold;
	}

	public int getEventsHandled() {
		return eventsHandled;
	}

	private void setEventsHandled(int eventsHandled) {
		this.eventsHandled = eventsHandled;
	}




	@Override
	public boolean notifySubscriber(Event e) {
		// TODO Auto-generated method stub
		
		if(e.getEventDataValaue()%2==0) {
			eventsHandled++;
			if(eventsHandled<=turnOffThreshold) {
				System.out.println("SubscriberEven: Event is Even : "+e.getEventDataValaue());
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
