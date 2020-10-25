package hw;

import java.util.ArrayList;


public class PublisherImp implements Publisher {
	
	private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
	

	public ArrayList<Subscriber> getSubscribers() {
		return subscribers;
	}

	@Override
	public void registerSubscriber(Subscriber s) {
		// TODO Auto-generated method stub
		this.subscribers.add(s);
		
	}

	@Override
	public void unregisterSubscriber(Subscriber s) {
		// TODO Auto-generated method stub
		this.subscribers.remove(s);
	}

	@Override
	public void notifySubscribers(Event e) {
		// TODO Auto-generated method stub
		for (Subscriber subscriber: subscribers) {
			subscriber.notifySubscriber(e);
		}
		
	}
	
	private Event generateEvent() {
		 int randomNum = (int)(Math.random() * 5000 + 1);	
			Event e = new Event(randomNum);
			return e;
		
	}

	public void runSimulation() {
		
		for(int i=0;i<200;i++) {
			
		Event randomNumber = generateEvent();
		System.out.println("SequenceNumber: "+i+" data to console: " + randomNumber.getEventDataValaue());
		notifySubscribers(randomNumber);
		}
	}
}
