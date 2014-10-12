package patterns.behavior.state.sample;

/**
 * Buyer who order one item repeatedly
 * 
 * @author Charles Chen
 * @date 2014Äê10ÔÂ12ÈÕ
 */
public class RepeatBuyer implements Buyer {

	@Override
	public void order(OrderManager mgr, OrderRecord record) {
		// TODO Auto-generated method stub
		System.out.println("User " + record.getUsername() + " has bought "
				+ record.getItem() + " before, not allow to order again");
	}

}
