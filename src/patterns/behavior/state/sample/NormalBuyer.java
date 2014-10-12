package patterns.behavior.state.sample;

/**
 * Normal buyer
 * 
 * @author Charles Chen
 * @date 2014��10��12��
 */
public class NormalBuyer implements Buyer {

	@Override
	public void order(OrderManager mgr, OrderRecord record) {
		// TODO Auto-generated method stub
		System.out.println("User " + record.getUsername() + " orders "
				+ record.getItem());
		mgr.getRecords().add(record);
	}

}
