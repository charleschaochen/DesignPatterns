package patterns.behavior.state.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * Order manager, the context for buyers
 * 
 * @author Charles Chen
 * @date 2014Äê10ÔÂ12ÈÕ
 */
public class OrderManager {
	private Buyer buyer;
	private List<OrderRecord> records;

	public OrderManager() {
		// TODO Auto-generated constructor stub
		records = new ArrayList<OrderRecord>();
	}

	/**
	 * Order a item
	 * 
	 * @param username
	 * @param item
	 */
	public void order(String username, String item) {
		OrderRecord record = new OrderRecord(username, item);
		if (records.contains(record)) {
			this.buyer = new RepeatBuyer();
		} else {
			this.buyer = new NormalBuyer();
		}
		buyer.order(this, record);
	}

	public List<OrderRecord> getRecords() {
		return records;
	}
}
