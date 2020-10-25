package hw;

public class hw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PublisherImp pub = new PublisherImp();
		
		Subscriber se = new SubscriberEven();
		se.setTurnOffThreshold(14);
		
		
		Subscriber so = new SubscriberOdd();
		so.setTurnOffThreshold(21);
		
		Subscriber st = new SubscriberThrees();
		st.setTurnOffThreshold(10);
		
		
		pub.registerSubscriber(se);
		pub.registerSubscriber(so);
		pub.registerSubscriber(st);
		
		pub.runSimulation();
	}

}
