package hw;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubscriberTest {
	@Test
	public void subscribenotifiedTestNegativeThreshold() {
		SubscriberEven sub = new SubscriberEven();
		sub.setTurnOffThreshold(1);
		Event e = new Event(10);
		
	
		assertEquals(false,sub.notifySubscriber(e));
	
		
	}

	@Test
	public void subscribenotifiedTestPositiveThreshold() {
		SubscriberEven sub = new SubscriberEven();
		sub.setTurnOffThreshold(10);
		Event e = new Event(10);
		
		assertEquals(true,sub.notifySubscriber(e));
		
	}
	
	@Test
	public void Test() {
		SubscriberEven sub = new SubscriberEven();
		sub.setTurnOffThreshold(1);
		Event e = new Event(40);
		
		assertEquals(true,sub.notifySubscriber(e));
		assertEquals(0,sub.getEventsHandled());

		
	}
}
