package hw;

public class hw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PublisherImp pub = new PublisherImp();
		
		SubscriberEven se = new SubscriberEven();
		se.setTurnOffThreshold(14);
		
		
		SubscriberOdd so = new SubscriberOdd();
		so.setTurnOffThreshold(21);
		
		SubscriberThrees st = new SubscriberThrees();
		st.setTurnOffThreshold(10);
		
		
		pub.registerSubscriber(se);
		pub.registerSubscriber(so);
		pub.registerSubscriber(st);
		
		pub.runSimulation();
	}

}
