package hw;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PublisherImpTest {

	@Test
	public void subscriberaddTest() {
		SubscriberEven sub = new SubscriberEven();
		
		PublisherImp pu= new PublisherImp();
		pu.registerSubscriber(sub);
		
		assertEquals(sub, pu.getSubscribers().get(0));
		
	}
	
	@Test
	public void subscriberremoveTest() {
		SubscriberEven sub = new SubscriberEven();
		
		PublisherImp pu= new PublisherImp();
		pu.registerSubscriber(sub);
		
		assertEquals(0,pu.getSubscribers().size());
		
	}
	@Test
	public void subscribenotifiedTest() {
		SubscriberEven sub = new SubscriberEven();
		sub.setTurnOffThreshold(14);
		Event e = new Event(10);
		
		PublisherImp pu= new PublisherImp();
		pu.registerSubscriber(sub);
		pu.notifySubscribers(e);
		assertEquals(true,sub.notifySubscriber(e));
		
	}
}
