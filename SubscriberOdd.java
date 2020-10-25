package hw;

public class SubscriberOdd  implements Subscriber{
	private int eventsHandled;
	private int turnOffThreshold;
	
	
	

	public SubscriberOdd() {
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
		
		if(e.getEventDataValaue()%2==1) {
			eventsHandled++;
			if(eventsHandled<=turnOffThreshold) {
				System.out.println("SubscriberOdd: Event is Odd : "+e.getEventDataValaue());
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
